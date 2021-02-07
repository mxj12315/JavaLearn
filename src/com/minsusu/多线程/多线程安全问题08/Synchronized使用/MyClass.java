package com.minsusu.多线程.多线程安全问题08.Synchronized使用;

public class MyClass {

    // 该函数使用synchronized修饰，线程会等待
    public  synchronized void doSome(){
        System.out.println(Thread.currentThread().getName() + " soSome---begin");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() +" soSome---end");
    }

    // 该函数调用时不会等待
    public void doOther(){
        System.out.println("doOther---begin");
        System.out.println("doOther---end");
    }

}
