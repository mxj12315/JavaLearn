package com.minsusu.面向对象03.构造方法重载;

public class User {
    public static void main(String[] args) {
        Student s = new Student("王小二", 18, 1.65);
        System.out.println(s.getAge());
        System.out.println(s.getName());
        System.out.println(s.getHeight());
        Student s1 = new Student("王小二", 1.65);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getHeight());

    }
}
