package com.minsusu.面向对象09.多态01;

/**
 * 鸟类
 */
public class Brid extends Animal{
    /**
     * 重写父类方法
     */
    @Override
    public void go() {
        // super.go();
        System.out.println("鸟会飞");
    }


    public void fly(){
        System.out.println("鸟儿飞行中");
    }
}
