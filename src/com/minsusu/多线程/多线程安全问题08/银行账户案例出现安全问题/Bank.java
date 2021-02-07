package com.minsusu.多线程.多线程安全问题08.银行账户案例出现安全问题;


/**
 * 银行账户类
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
    public void whitMoney(int m ){
        // 余额 = 之前的余额 - 取钱金额
        int yue = this.getBalance() - m;

        // t1和t2可能都进来执行这个函数，但是由于延迟T1还没有执行完，余额没有更新，t2进来是余额任然是10000
        //模拟网络延迟
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 更新余额
        this.setBalance(yue);
    }
}
