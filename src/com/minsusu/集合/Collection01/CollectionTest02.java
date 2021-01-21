package com.minsusu.集合.Collection01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 迭代器
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();  // 存入和迭代取出顺序一致
        c.add(123);
        c.add("sdf");
        c.add(new Object());
        c.add(new int[5]);

        Iterator iterator = c.iterator(); //迭代器
        while (iterator.hasNext()){
            // 存入什么类型返回的就是什么类型
            // 这里可以使用instanceof做类型判断
            /*if (iterator.next() instanceof Integer){
                System.out.println(iterator.next());
            }*/
            System.out.println(iterator.next());
        };
        System.out.println("");
        Collection hashSet = new HashSet();  // 迭代无序，不重复
        hashSet.add(899);
        hashSet.add(45);
        hashSet.add(45);
        hashSet.add("1122");

        Iterator iterator2 = c.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
