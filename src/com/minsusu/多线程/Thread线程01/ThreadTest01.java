package com.minsusu.多线程.Thread线程01;


/**
 * 不使用多线程
 *  先执行run(),在执行
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        run();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程"+i);
        }
    }


    public static void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("子线程"+i);
        }

    }
}


