package com.minsusu.多线程.终止线程04;


/**
 * thread.stop(); // 强行终止线程，容易造成数据丢失，不建议使用
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread thread  = new Thread(new Mytest());

        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 已过时
        thread.stop(); // 强行终止线程，容易造成数据丢失
    }
}
