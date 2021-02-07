package com.minsusu.多线程.守护线程;


/**
 * 守护线程
 *      所有的主线程结束了，子线程自动结束
 */
public class ThreadTest {
    public static void main(String[] args) {
        //main线程模拟用户线程
        Mytest t1 = new Mytest();
        t1.setName("t1");
        t1.setDaemon(true); // 开启守护线程，main用户线程结束，t1线程结束
        t1.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"=="+i);
        }
    }
}



class Mytest extends Thread{
    @Override
    public void run() {
        // 子进程
        int i= 0;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"进程"+i++);
        }
    }
}