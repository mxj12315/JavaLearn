package com.minsusu.多线程.多线程安全问题08.使用线程同步;


public class Test {
    public static void main(String[] args) {
        Bank bank =new Bank();
        WithdrawalThread t1 = new WithdrawalThread(bank,5000);
        WithdrawalThread t2 = new WithdrawalThread(bank,5000);
        t1.start();
        t2.start();

    }
}
