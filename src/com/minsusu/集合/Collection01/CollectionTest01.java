package com.minsusu.集合.Collection01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.collection
 * 1、collection中存放什么元素：
 * 没有泛型之前，collection中可以存放Object的所有类型
 * 使用泛型之后，collection种只可以存放某个具体的类型
 * collection中值存放对象的地址
 * 2、常用方法
 * boolean add(Object e)向集合中添加元素
 * int size()获取集合元素个数
 * boolean contains(Object o)判断集合中是否包含某个元素
 * boolean remove(object o)移除某个元素
 * boolean isEmpty()判断集合是否为空
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection c = new ArrayList();
        // 添加元素
        c.add(123);//123自动装箱 Integer i = new Integer(123)
        c.add("sags");
        c.add(true);
        c.add(3.141);
        c.add(new AA());
        //判断集合中是否包含某个元素
        System.out.println("collection结合中是否包含sags元素：" + c.contains("sags"));  //true

        // 查询集合长度
        System.out.println("collection长度：" + c.size());
        //删除某个元素
        c.remove(123);
        System.out.println("collection结合中是否包含123元素：" + c.contains(123));  //false

        Object[] d = c.toArray();
        for (int i = 0; i <  d.length; i++) {
            System.out.println("第"+i+"个元素是："+d[i]);

        }

        //清空集合
        c.clear();
        System.out.println("集合是否为空：" + c.isEmpty());
        // 查询集合长度
        System.out.println("清空后collection长度：" + c.size());


    }

}


class AA{
    public String toString(){
        return "AA对象重写toString方法";
    }
}
