package com.minsusu.泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fanxing02 {
    public static void main(String[] args) {
        //List<Animal1> 表示只能存放Animal类型的数据
        List<Animal1> list = new ArrayList<Animal1>();
        Animal1 cat = new Cat1();
        Animal1 bird = new Bird1();
        list.add(cat);
        list.add(bird);
        // list.add("123");  使用泛型，只能存储一类的数据


        Iterator<Animal1> JJ = list.iterator();
        while (JJ.hasNext()) {
            Animal1 a = JJ.next();
            a.move();
        }
    }
}

class Animal1 {
    public void move() {
        System.out.println("动物在移动");
    }
}


class Cat1 extends Animal1 {
    @Override
    public void move() {
        System.out.println("猫在跑");
    }
}


class Bird1 extends Animal1 {
    public void move() {
        System.out.println("鸟儿在飞");
    }
}
