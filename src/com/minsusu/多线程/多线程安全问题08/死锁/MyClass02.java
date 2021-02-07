package com.minsusu.多线程.多线程安全问题08.死锁;

public class MyClass02 implements Runnable{

    private  Object o1;
    private Object o2;

    public MyClass02(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
            synchronized (o2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){

                }
            }
    }
}
