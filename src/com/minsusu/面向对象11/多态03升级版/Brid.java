package com.minsusu.面向对象11.多态03升级版;

/**
 * 鸟类
 */
public class Brid extends Pet{

    @Override
    public void eat() {
        // super.go();
        System.out.println("鸟吃稻谷");
    }


    public void fly(){
        System.out.println("鸟儿飞行中");
    }
}
