package com.soar.smsbdemo.keepmoving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListNode {
    int value;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}

public class BasicALG {

    public static void main(String[] args) {
//        String str = "Hello World";
//        char[] kas = str.toCharArray();
//        for(char c : kas) {
//            System.out.println(c);
//        }
        int[] arrs = new int[] {23, 43, 45, 4, 67, 89, 23, 6, 99};


        //bubbleSort2(arrs);
        //insertSort3(arrs);
        List<Integer> result = new ArrayList<>();
        System.out.println(result.get(3));

        int[] nums1 = new int[] {23, 32, 54, 57};
        int[] nums2 = new int[] {1, 34, 35, 89};
        int[] merged = new int[nums1.length+nums2.length];
        mergeArray(nums1, nums2, merged);
        System.out.println(Arrays.toString(merged));

        //System.out.println("+++++++++排序前++++++++++");
        //printArray(arrs);

        //System.out.println("+++++++++排序前++++++++++");
        //insertSort2(arrs);
        //BubbleSort(arrs);
        //printArray(arrs);
    }

    public void traverseBiTree(TreeNode node, int n, int[] result) {
        if (node == null) {
            return;
        }
        if (result[n] == 0) {
            result[n] = node.value;
        } else if (result[n] < node.value) {
            result[n] = node.value;
        }
        System.out.println(node.value);
        traverseBiTree(node.left, n-1, result);
        traverseBiTree(node.right, n-1, result);
    }

    public static void mergeArray(int[] nums1, int[] nums2, int[] merged) {
        if (nums1 == null || nums2 == null) {
            return;
        }

        int i =0;
        int index1=0, index2=0;
        while(index1<nums1.length || index2<nums2.length) {
            if(index1==nums1.length) {
                merged[i] = nums2[index2];
                i++;
                index2++;
            } else if(index2==nums2.length) {
                merged[i] = nums1[index1];
                i++;
                index1++;
            } else if(nums1[index1] <= nums2[index2]) {
                merged[i] = nums1[index1];
                i++;
                index1++;
            } else {
                merged[i] = nums2[index2];
                i++;
                index2++;
            }
        }

    }

    public static void insertSort3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        for (int i = 1; i < nums.length; i++) {
           for (int j = i; j>0; j--) {
               if(nums[j] < nums[j-1]) {
                   int temp = nums[j];
                   nums[j] = nums[j-1];
                   nums[j-1] = nums[j];
               } else if (nums[j] >= nums[j-1]) {
                   break;
               }
           }
        }
    }

    public static void bubbleSort2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        for(int i=0; i < nums.length-1; i++) {
            for(int j=0; j < nums.length-i-2; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

    }

    /**
     * 两个有序单链表合并
     * @param l1
     * @param l2
     */
    public static ListNode leetcode_21(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current = head;

        while(l1 != null || l2 != null) {
            if (l1 == null && l2 != null) {
                current.next = l2;
                break;
            } else if (l2 == null && l1 != null) {
                current.next = l1;
                break;
            }
            if (l1.value <= l2.value) {
                current.next = l1;
                current = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                current = l2;
                l2 = l2.next;
            }
        }
        return head.next;
    }

    /**
     * 最长回文子串
     * @param s
     */
    public static String leetcode_5(String s) {
        char[] cs = s.toCharArray();

        int maxHuiWenLen = 1;
        int maxHuiWenStartIndex = 0;
        for (int i = 0; i < cs.length; i++) {
            for (int j = i; j < cs.length; j++) {
                if (judgeHuiWenStr(cs, i, j) && maxHuiWenLen < j-i+1) {
                    maxHuiWenLen = j-i+1;
                    maxHuiWenStartIndex = i;
                }
            }
        }

        return s.substring(maxHuiWenStartIndex, maxHuiWenStartIndex+maxHuiWenLen);
    }

    /**
     * 判断一个字符串是否是回文串
     * @param cs
     * @param start
     * @param end
     * @return
     */
    public static boolean judgeHuiWenStr(char[] cs, int start, int end) {
        while(start < end) {
            if (cs[start] != cs[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * 斐波那契数列 f(n)=f(n-1)+f(n-2), f(0)=0, f(1)=1, 递归实现
     * @param n
     * @return
     */
    public static int leetcode_509_2(int n) {
        if (n < 2) {
            return n;
        }
        return leetcode_509_2(n-1) + leetcode_509_2(n-2);
    }

    /**
     * 斐波那契数列 f(n)=f(n-1)+f(n-2), f(0)=0, f(1)=1， 动态规划实现
     */
    public static int leetcode_509 (int n) {
        if (n < 2) {
            return n;
        }

        int p = 0, q = 1, r = 0;
        for (int i = 2; i <= n; i++) {
            r = p + q;
            p = q;
            q = r;
        }

        return r;
    }

    /**
     * 合并两个有序的数组，解法二
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void leetcode_88_2(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m+n];
        int i = 0, j = 0, cur = 0;
        while(i < m || j < n) {
            if (i == m) {
                merged[cur] = nums2[j];
                j++;
            } else if (j == n) {
                merged[cur] = nums1[i];
            } else if (nums1[i] <= nums2[j]) {
                merged[cur] = nums1[i];
                i++;
            } else {
                merged[cur] = nums2[j];
                j++;
            }
            cur++;
        }

        for (int k = 0; k < m+n; k++) {
            nums1[k] = merged[k];
        }
    }

    /**
     * 合并两个有序数组
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void leetcode_88(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
            for (int j = m-1+i; j >= 0; j--) {
                if (nums1[j+1] < nums1[j]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
    }

    /**
     * 两个数之和
     * @param nums
     * @param target
     * @return
     */
    public static int[] leetcode_1(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

    /**
     * 冒泡排序
     * @param nums
     */
    public static void BubbleSort(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }

        for(int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    /**
     * 直接插入排序，交换法
     * @param nums
     */
    public static void insertSort2(int[] nums) { //插入排序之交换法
        if(nums == null || nums.length == 0) {
            return;
        }

        for (int i = 1; i < nums.length; i++) {
            for(int j = i - 1; j >= 0; j--) {
                if (nums[j] <= nums[j+1]) {
                    break;
                }
                int temp = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = temp;
            }
        }
    }

    /**
     * 直接插入排序，移位法
     * @param nums
     */
    public static void insertSort(int[] nums) { //插入排序之移位法
        if (nums == null || nums.length == 0) {
            return;
        }

        for (int i=1; i<nums.length; i++) { // i代表待插入元素的index，范围是[1, nums.length)
            int temp = nums[i];

            int j = i - 1;  // j代表的是已经有序部分的index，范围是[i-1, 0]
            for(; j>=0; j--) {
                if (nums[j] <= temp) {
                    break;
                }
                nums[j+1] = nums[j];
            }
            nums[j+1] = temp;
        }
    }

    /**
     * 打印数组中的内容
     * @param nums
     */
    public static void printArray(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }
}
