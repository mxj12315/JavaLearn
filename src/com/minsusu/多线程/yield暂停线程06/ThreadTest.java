package com.minsusu.多线程.yield暂停线程06;


/**
 * Thread.yield()暂停线程
 */
public class ThreadTest {


    public static void main(String[] args) {
        Mytest m  = new Mytest();
        Thread thread  = new Thread(m);

        thread.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("主线程：===="+i);
        }


    }
}
