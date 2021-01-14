package com.minsusu.面向对象10.多态02;


/**
 * 不使用更多态
 * 扩展能力不强，如果在加一个Dog类，则需要在Master类中添加feed(Dog d)方法
 * 耦合度太高，master类与cat、brid、dog类关联度太高
 */
public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();  // 创建猫对象
        Brid b = new Brid();  // 创建鸟对象
        Master m = new Master(); // 创建主人对象
        m.feed(c);
        m.feed(b);
    }
}
