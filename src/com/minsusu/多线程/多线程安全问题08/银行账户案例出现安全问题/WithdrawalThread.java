package com.minsusu.多线程.多线程安全问题08.银行账户案例出现安全问题;

/**
 * 取款
 */
public class WithdrawalThread extends Thread{
    private  Bank bank;
    private int quMoney;
    public WithdrawalThread(){

    }

    public WithdrawalThread(Bank bank,int quMoney){
        this.bank = bank;
        this.quMoney = quMoney;
    }

    @Override
    public void run() {
        int yue = this.bank.getBalance();  // 获取余额 10000
        this.bank.whitMoney(this.quMoney);

        System.out.println(Thread.currentThread().getName()+"取款"+this.quMoney+"后剩余："+bank.getBalance());
    }
}
