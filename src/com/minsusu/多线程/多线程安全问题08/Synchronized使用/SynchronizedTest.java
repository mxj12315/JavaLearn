package com.minsusu.多线程.多线程安全问题08.Synchronized使用;

public class SynchronizedTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "---begin");

        MyThread myThread =new MyThread(new MyClass());
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);


        // 线程取名字
        t1.setName("t1");
        t2.setName("t2");

        // 启动线程
        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName() + "---end");
    }
}
