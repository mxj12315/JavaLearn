package com.minsusu.多线程.Thread修改获取线程名称02;

/**
 * 设置修改线程的名字
 *      setName()
 *      getName()
 *      如果没有给名字，默认是Thread-0,Thread-1,……
 * 获取当前线程
 *       Thread currentThread = Thread.currentThread();
 */
public class ThreadTestChange {
    public static void main(String[] args) {
        MyThreadChangeName m1 = new MyThreadChangeName();
        MyThreadChangeName m2 = new MyThreadChangeName();
        m1.setName("m1");
        System.out.println(m1.getName());  //sdd
        System.out.println(m2.getName());  //Thread-1


        // 获取当前线程
        Thread currentThread = Thread.currentThread();
        System.out.println("当前线程名： "+currentThread.getName());

        m1.start();
        m2.start();

    }
}


class MyThreadChangeName extends Thread{
    @Override
    public void run() {
        // 获取当前线程
        Thread currentThread = Thread.currentThread();
        System.out.println("当前子线程名： "+currentThread.getName());
        System.out.println("当前子线程名： "+super.getName());  //只能在线程类中
        System.out.println("当前子线程名： "+this.getName());    //只能在线程类中

    }
}