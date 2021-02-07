package com.minsusu.多线程.yield暂停线程06;

public class Mytest implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (i%100==0){
                Thread.yield();  // 每100次暂停一下
        }
            System.out.println("子线程：---"+i);
    }


}
}
