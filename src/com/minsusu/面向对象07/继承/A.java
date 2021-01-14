package com.minsusu.面向对象07.继承;

public class A extends B{
    public static void main(String[] args) {
        A a= new A();
        System.out.println(a.cheight);  // 访问c
        a.setCname("a传递的cname");
        System.out.println(a.getCname());


        System.out.println(a.getBname());
    }
}
