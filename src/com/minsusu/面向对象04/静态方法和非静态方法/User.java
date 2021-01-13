package com.minsusu.面向对象04.静态方法和非静态方法;

public class User {
    public static void main(String[] args) {
        // 调用static修饰的静态方法：类名.方法名()  或者 方法名()
        User.sum();
        // or
        //sum();

        // 调用不带static修饰的静态方法:需要new 构造方法(参数列表)
        User u = new User();
        u._sum();

    }

    /*
    * 这是static修饰符的方法
    */
    public static void sum(){
        System.out.println("static方法");
    }

    /*
     * 这是不带static修饰符的方法
     */
    public void _sum(){
        System.out.println("不带static方法");
    }
}
