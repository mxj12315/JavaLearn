package com.minsusu.多线程.Thread线程01;


/**
 * 第一种多线程创建方式
 *      继承java.lang.Thread
 */
public class ThreadTest02 {
    public static void main(String[] args) {
         // 创建对象
        _Thread thread = new _Thread();
        thread.start();  // 启动线程，创建一个线程分支栈
        //thread.run();// 不会产生多线程，只是普通的方法调用

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程***："+i);
        }
    }
}

class _Thread extends Thread{

    //重写Thread类的run()
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("子线程："+i);
        }
    }
}
