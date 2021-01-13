package com.minsusu.面向对象02.构造方法;

public class Student {
    private String name;
    private int age = 18;
    private double height;

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
