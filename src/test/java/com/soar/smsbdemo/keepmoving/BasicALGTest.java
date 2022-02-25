package com.soar.smsbdemo.keepmoving;

import org.junit.Assert;
import org.junit.Test;

import static com.soar.smsbdemo.keepmoving.BasicALG.*;

public class BasicALGTest {

    @Test
    public void leetcode_509_Test() {
        int n = 8;
        int x = leetcode_509(n);
        int y = leetcode_509_2(n);
        System.out.println(x + " " + y);
        Assert.assertEquals(x, y);
    }

    @Test
    public void leetcode_88_Test() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        leetcode_88_2(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.println(num);
        }
    }

    @Test
    public void leetcode_1_Test() {
        int[] arrs = new int[] {23, 43, 45, 4, 67, 89, 23, 6, 99};
        int[] result = leetcode_1(arrs, 66);
        for(int item : result) {
            System.out.println(item);
        }
    }
}
