package com.minsusu.面向对象09.多态01;


/**
 * 猫类
 */
public class Cat extends Animal {


    /**
     * 方法重写
     */
    @Override
    public void go() {
//        super.go();
        System.out.println("猫在睡觉");
    }

    public void arrest(){
        System.out.println("猫抓老鼠");
    }
}
