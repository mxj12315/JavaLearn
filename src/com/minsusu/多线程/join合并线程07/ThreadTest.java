package com.minsusu.多线程.join合并线程07;


/**
 * join线程合并
 */
public class ThreadTest {


    public static void main(String[] args) {
        Mytest m  = new Mytest();
        Thread thread  = new Thread(m);

        thread.start();
        thread.setName("t");

        try {
            thread.join();  //线程合并，main线程和t线程合并，等待t线程执行完
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"线程结束");
    }
}
