package com.minsusu.面向对象00;

public class User {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 18;
        s.name = "张三";
        s.addr = new Addr();
        s.addr.city="北京";
        s.addr.email = "837850238@qq.com";
        s.addr.postcode = 8712314;
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.addr.city);
        System.out.println(s.addr.email);
        System.out.println(s.addr.postcode);

    }
}
