package com.minsusu.多线程.多线程安全问题08.Synchronized使用;

public class MyThread implements Runnable {
    private MyClass myClass;

    /**
     * 无参数构造方法
     */
    public MyThread(){

    }


    /**
     * 有参数构造方法
     * @param myClass  myClass类创建的实例
     */
    public MyThread(MyClass myClass){
        this.myClass = myClass;
    }
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            myClass.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            myClass.doOther();
        }
    }
}
