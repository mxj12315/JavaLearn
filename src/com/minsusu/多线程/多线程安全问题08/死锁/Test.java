package com.minsusu.多线程.多线程安全问题08.死锁;


/**
 * t1 在使用O1对象时未释放，接着要使用o2，但是o2倍t2线程锁住，o2又要使用o1，o1还在被t1线程锁着，形成僵持
 */
public class Test {
    public static void main(String[] args) {
        Object o1 =new Object();
        Object o2 =new Object();

        MyClass01 m1 = new MyClass01(o1,o2);
        MyClass02 m2 = new MyClass02(o1,o2);

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();
    }
}
