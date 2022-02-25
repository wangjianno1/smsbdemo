package com.soar.smsbdemo.keepmoving;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("main test running~~~");
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

        for(String item : set) {
            System.out.println(item);
        }

        System.out.println("end for each....");
    }
}
