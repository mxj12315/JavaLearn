package com.minsusu.多线程.多线程安全问题08.使用线程同步;


/**
 * 银行账户类，使用线程同步
 * synchronized(){ }  同步线程代码块
 */
public class Bank {
    private int balance = 10000;  //余额
    private int money;  // 取钱的金额

    public Bank() {
    }



    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    /**
     * 取款方法
     */
    // public synchronized void whitMoney(int m ){  synchronized出现在实例方法上表示的this，不灵活，会扩大同步的范围，导致出现执行效率降低
    public  void whitMoney(int m ){
        // synchronized(多线程共享的对象，t1、t2都共享银行对象（同一个ATM机），所以这里是this)，如果写字符串，则表示所有都要等
        // t1 执行时候，会上锁，执行完毕后开锁，t2进入

        synchronized (this){
            // 余额 = 之前的余额 - 取钱金额
            int yue = this.getBalance() - m;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 更新余额
            this.setBalance(yue);
        };

    }
}
