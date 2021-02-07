package com.minsusu.多线程.终止线程升级版05;

public class Mytest implements Runnable {
    private boolean flag = true;  //打一个标记，用于终止线程

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (flag) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }else {
                return;
        }
    }


}
}
