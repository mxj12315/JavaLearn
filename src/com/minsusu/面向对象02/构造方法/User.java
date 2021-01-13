package com.minsusu.面向对象02.构造方法;

public class User {
    public static void main(String[] args) {
        Student s = new Student("王小二", 18, 1.65);
        System.out.println(s.getAge());
        System.out.println(s.getName());
        System.out.println(s.getHeight());
    }
}
