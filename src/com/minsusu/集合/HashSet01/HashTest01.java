package com.minsusu.集合.HashSet01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet集合，无序不重复
 */
public class HashTest01 {
    public static void main(String[] args) {
        Set<String> set  = new HashSet<>();
        set.add("123");
        set.add("hhh");
        set.add("hhh");
        set.add("koko");
        System.out.println("集合的内容长度"+set.size());
         Iterator<String> nn =set.iterator();
        while (nn.hasNext()){
            String s = nn.next();
            System.out.println(s);
            /*123
            hhh
            koko*/
        }


    }
}
