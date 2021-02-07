package com.minsusu.多线程.Thread线程01;


/**
 * 第二种多线程创建方式
 *      实现接口Runnable
 *      构造方法Thread(Runnable target)
 *
 */
public class TreadTest03 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread01 myThread01 = new MyThread01();
        Thread t1 = new Thread(myThread);  // 构造方法Thread(Runnable target)
        Thread t2 = new Thread(myThread01);  // 构造方法Thread(Runnable target)
        t1.start();
        t2.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程*** "+i);
        }
    }
}



class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("子线程1：---"+i);
        }
    }
}


class MyThread01 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("子线程2&&&&" + i);
        }
    }
}