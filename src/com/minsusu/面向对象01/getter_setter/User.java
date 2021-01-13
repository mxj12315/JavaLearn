package com.minsusu.面向对象01.getter_setter;

public class User {
    public static void main(String[] args) {
        Student s = new Student();
        // Setter方法
        s.setAge(18);
        s.setName("张三丰");
        s.setHeight(1.80);
        // Getter方法
        System.out.println(s.getAge());
        System.out.println(s.getName());
        System.out.println(s.getHeight());
    }
}
