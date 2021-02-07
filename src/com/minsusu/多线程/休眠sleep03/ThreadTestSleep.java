package com.minsusu.多线程.休眠sleep03;


/**
 * Thread.sleep(毫秒),静态方法
 *      让当前线程休眠指定时间
 */
public class ThreadTestSleep {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                // myTest.sleep(1000);  // 这行代码只会让main线程休眠，sleep是静态方法，会转换为Thread.sleep()
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+i);

        }
    }
}

class MyTest extends Thread{

    // run方法中异常只能使用try catch,子类异常不能比父类广
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
