package com.minsusu.多线程.休眠sleep03;


/**
 * interrupt() 以异常的方式唤醒休眠的线程
 */
class ThreadTestSleep1 {
    public static void main(String[] args) {
        MyTest1 myTest1 = new MyTest1();
        myTest1.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+i);

        }
        myTest1.interrupt(); // 以异常的方式终止线程的休眠 java.lang.InterruptedException: sleep interrupted
    }
}

class MyTest1 extends Thread{

    // run方法中异常只能使用try catch,子类异常不能比父类广
    @Override
    public void run() {
        System.out.println("MyTest1线程---》Start");
        try {
            // 休眠1年
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("MyTest1线程---》end");
    }
}
