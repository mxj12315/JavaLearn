package com.minsusu.面向对象13.super关键字;


public class SuperTest {
    public static void main(String[] args) {
        new B();
    }
}


class A {
    // 建议写上无参构造，防止子类继承时候默认调用super()，无参数构造方法
    public A() {
        System.out.println("A的无参数构造方法");
    }

    public A(int a) {
        System.out.println("A的有参数构造方法");
    }
}


class B extends A {
    public B() {
        // super(); // 默认的
        // super(1);  // 调用父类中的有参数的构造器
        this("周杰伦");  // 调用本类中的另一个构造器
        System.out.println("B的无参数构造方法");
    }


    public B(String s) {
        System.out.println("B的有参数构造方法");
    }
}