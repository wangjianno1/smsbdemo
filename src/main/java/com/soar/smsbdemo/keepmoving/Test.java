package com.soar.smsbdemo.keepmoving;

import com.soar.smsbdemo.entity.User;

import java.util.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("sdsdf");
        System.out.println(list);

        List<String> ls = Collections.singletonList("sdfsfd");
        ls.add("sfsfd");


//        Instant now = Instant.now();
//        System.out.println(now);
//        System.out.println(LocalDateTime.now());
//        Map<String, String> map = new HashMap<>();
//        map.keySet()
//
//        User u1 = new User();
//        User u2 = new User();
//        u2.setName("张三");
//        User u3 = null;
//
//        Optional<User> user1 = Optional.of(u1);
//        Optional<User> user2 = Optional.of(u2);
//
//        //System.out.println(user1.isPresent());
//
//        Optional<User> user3 = Optional.ofNullable(u3);
//
//        Optional<String> kaka = user2.map(user -> user.getName());
//        System.out.println(kaka);


        //System.out.println(0.3 - 0.1);
//
//        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
//        String[] strs1 = new String[] {"sdfsaf", "121", "3223"};
//        String[] strs2 = new String[] {"hfthtrh", "07678", "65765"};
//        System.out.println(Arrays.asList(strs1, strs2));


//        LocalDate localDate = LocalDate.now();
//        LocalTime localTime = LocalTime.now();
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDate);
//        System.out.println(localTime);
//        System.out.println(localDateTime);


//        List<String> list = new ArrayList<>();
//        list.stream()
//                .count();

//        BigDecimal a = new BigDecimal(Double.toString(1.233));
//        BigDecimal b = new BigDecimal(Float.toString(3.3f));
//        BigDecimal r = a.divide(b, 3, BigDecimal.ROUND_HALF_UP);

       // System.out.println(r);

    }

    public static int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        int maxLen = 1;
        for (int i=0; i<ch.length; i++) {
            for (int j=i+1; j<ch.length; j++) {
                if(s.substring(i, j).indexOf(ch[j]) != -1) {
                    if(maxLen < j-i) maxLen = j-i;
                    break;
                }
            }
        }
        return maxLen;

    }

    /**
     * 使用栈来遍历二叉树，先序遍历
     * @param root
     * @param result
     */
    private void useStackTraverseBiTree(TreeNode root, List<Integer> result) {
        if (root == null)  return;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while(stack.peek() != null) {
            TreeNode node = stack.pop();
            result.add(node.value);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
    }

    private void func1() {
        long a = 1;
        float b = 1.2f;

        List<String> lst = new ArrayList<String>();
        lst.add("Ni");
        lst.add("Hao");
        lst.forEach(item -> System.out.println(item));


        Set<String> set = new HashSet<String>();
        set.add("BeiJing");
        set.add("WuHan");
        set.add("TianJin");
        set.add("WuHan");

        "第三方safd".contains("df");



        for(String item : set) {
            System.out.println(item);
        }

        System.out.println("end for each....");
    }
}
