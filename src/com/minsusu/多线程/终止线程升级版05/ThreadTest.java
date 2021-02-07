package com.minsusu.多线程.终止线程升级版05;


/**
 * thread.stop(); // 强行终止线程，容易造成数据丢失，不建议使用
 */
public class ThreadTest {


    public static void main(String[] args) {
        Mytest m  = new Mytest();
        Thread thread  = new Thread(m);

        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // 终止线程执行
        m.setFlag(false);
    }
}
