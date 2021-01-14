package com.minsusu.面向对象05.变量类型;

public class User {
    public static void main(String[] args) {
        /*
//      传递基本类型的参数
        int i = 10;
        increment(i);   // 11
        System.out.println("main1:" + i);  // 10
         */
        // 传递引用类型参数
        Student s = new Student();
        s.age = 10;
        increment(s);  //10
        System.out.println("main2:" + s.age);  // 11
    }



    public static void increment(Student s) {
        s.age++;
        System.out.println("increment:" + s.age);  // 11
    }
}
