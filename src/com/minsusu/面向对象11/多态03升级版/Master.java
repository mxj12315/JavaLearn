package com.minsusu.面向对象11.多态03升级版;


import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 主人类
 */
public class Master {

    // 传入pet类
    public void feed(Pet p){
        p.eat();
    }

}
