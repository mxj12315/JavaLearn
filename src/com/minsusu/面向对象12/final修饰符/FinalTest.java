package com.minsusu.面向对象12.final修饰符;

import com.minsusu.面向对象00.Student;

public class FinalTest {
    // final int a;  // 错误
    final int a = 123;  // 正确

    public static void main(String[] args) {
        final  A s  = new A();
        // s = new A();   //无法将值赋给 final 变量 's', 内存无法回收
        s.b= 18;
        System.out.println(s.b);   // 18
        new Student();
    }
}


class A {
    int b;
    public static final String GUO_JI = "中国";  // 常量
}