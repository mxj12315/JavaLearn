package com.minsusu.面向对象10.多态02;

/**
 * 主人类
 */
public class Master {

    // 喂养猫的方法
    public void feed(Cat c){
        c.eat();
    }

    // 喂养鸟的方法
    public void feed(Brid b){
        b.eat();
    }

}
