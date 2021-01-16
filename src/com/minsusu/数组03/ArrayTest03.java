package com.minsusu.数组03;

import com.minsusu.面向对象10.多态02.Brid;

public class ArrayTest03 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Animal();
        Animal[] animals = {a, b};
        System.out.println(animals[0].run());  //动物在跑
        animals[1].eat();  //动物吃东西


        Animal c1 = new Cat();
        Animal c2 = new Bird();

        Animal[] animals1 = {c1, c2};

        for (int i = 0; i < animals1.length; i++) {
            if (animals1[i] instanceof Cat) {
                Cat n = (Cat) animals1[i];
                n.eat(); //猫在吃东西
                n.seize(); //猫抓老鼠
            } else if (animals1[i] instanceof Bird) {
                Bird m = (Bird) animals1[i] ;
                m.eat(); //小鸟吃东西
                m.fly(); // 鸟儿在飞
            }
        }


    }
}


class Animal {
    public String run() {
        return "动物在跑";
    }

    public void eat() {
        System.out.println("动物吃东西");
    }
}


class Cat extends Animal {
    public void eat() {
        System.out.println("猫在吃东西");
    }


    // cat类中特有的方法
    public void seize() {
        System.out.println("猫抓老鼠");
    }
}


class Bird extends Animal {
    public void eat() {
        System.out.println("小鸟吃东西");
    }


    // cat类中特有的方法
    public void fly() {
        System.out.println("鸟儿在飞");
    }
}