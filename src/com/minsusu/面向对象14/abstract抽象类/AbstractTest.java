package com.minsusu.面向对象14.abstract抽象类;

public class AbstractTest {
    public static void main(String[] args) {
        new Dog();
    }
}


abstract class Animal{
    /**
     * 抽象方法
     */
    public abstract void run();
}

class Dog extends Animal{
    /**
     * 实现/重写父类的抽象方法
     */
    @Override
    public void run() {
        System.out.println("实现父类的抽象方法");
    }
}
