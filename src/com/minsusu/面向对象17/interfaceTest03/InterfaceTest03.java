package com.minsusu.面向对象17.interfaceTest03;


import com.minsusu.面向对象07.继承.A;

public class InterfaceTest03 {
    public static void main(String[] args) {
        Flyable n = new Cat();
        n.fly();  // 猫咪会飞

        Flyable s = new snake();
        s.fly();  // 会飞的蛇

    }
}


class Animal {
    public void run(){
        System.out.println("动物会跑");
    }
}

interface Flyable {
    void fly();
}

//继承和接口同时存在
class Cat extends Animal implements Flyable {
    public void fly() {
        System.out.println("猫咪会飞");
    }
}


class snake extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("会飞的蛇");
    }
}