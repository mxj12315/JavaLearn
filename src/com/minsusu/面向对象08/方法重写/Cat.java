package com.minsusu.面向对象08.方法重写;


import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 猫类
 */
public class Cat extends Animal{
    public static void main(String[] args) {
        Cat c = new Cat();
        // c.go();   // 动物在跑
        c.go();  // 重写=》猫在睡觉
    }

    /**
     * 方法重写
     */
    @Override
    public void go() {
//        super.go();
        System.out.println("猫在睡觉");
    }
}
