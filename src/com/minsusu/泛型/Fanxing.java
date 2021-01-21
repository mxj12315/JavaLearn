package com.minsusu.泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 没有使用泛型
 */
public class Fanxing {
    public static void main(String[] args) {
        List list = new ArrayList();
        Animal cat = new Cat();
        Animal bird = new Bird();
        list.add(cat);
        list.add(bird);

        for (int i = 0; i <list.size() ; i++) {
           Object o =list.get(i);  //不使用泛型，只能用Object接收
           if (o instanceof Animal){
               ((Animal)o).move();
           }
        }
    }
}


class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}


class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在跑");
    }
}


class Bird extends Animal{
    public void move(){
        System.out.println("鸟儿在飞");
    }
}