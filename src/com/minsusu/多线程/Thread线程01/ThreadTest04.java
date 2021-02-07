package com.minsusu.多线程.Thread线程01;


/**
 * 使用匿名内部类
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("zixinc"+i);
                }

            }
        });   //这里要有分号

        t.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("主线程："+i);
        }
    }
}
