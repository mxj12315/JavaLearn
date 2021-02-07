package com.minsusu.多线程.Callable实现多线程09;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("begin");
                Thread.sleep(1000*10);
                System.out.println("end");
                return 100;
            }
        });

        Thread t = new Thread(futureTask);
        t.start();

        // 拿到t线程的返回值
        Object O = futureTask.get(); // get方法会导致获取结果过程中 main方法阻塞

        System.out.println("hello world");
    }
}
