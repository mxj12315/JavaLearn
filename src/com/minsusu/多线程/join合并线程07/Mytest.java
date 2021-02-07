package com.minsusu.多线程.join合并线程07;

public class Mytest implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+" 线程： "+i);
    }


}
}
