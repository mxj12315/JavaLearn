package com.minsusu.面向对象18.interfaceTest04;


/**
 * 餐馆订餐案例
 */
public class InterfaceTest04 {
    public static void main(String[] args) {
        // FoodMenu cookie = new ChinaCookie();// 创建一个中国厨师
        FoodMenu cookie = new AmericaCookie();// 创建一个美国厨师

        Customer c = new Customer(cookie);// 创建顾客对象,并且入一个厨师对象，调用的是有参数的构造方法
        c.oder(cookie);
        System.out.println(c);
    }
}
