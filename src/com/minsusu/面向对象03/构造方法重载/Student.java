package com.minsusu.面向对象03.构造方法重载;

public class Student {
    private String name;
    private int age = 18;
    private double height;

    // 手动创建缺省构造器
    public Student() {

    }
    // 一个参数的构造器，可以用于方法重载
    public Student(String name) {
        this.name = name;
    }
    // 一个参数的构造器，可以用于方法重载
    public Student(int age) {
        this.age = age;
    }
    // 两个参数的构造器，可以用于方法重载，可以使用默认值
    public Student(String name, double height) {
        this.name = name;
        this.height = height;
    }

    // 一个参数的构造器，可以用于方法重载
    public Student(double height) {
        this.height = height;
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public double getHeight() {
          return height;
     }

     public void setHeight(double height) {
          this.height = height;
     }
}
