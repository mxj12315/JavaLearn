package com.minsusu.面向对象11.多态03升级版;


/**
 * 使用多态
 *  master类与抽象的Pet类关联
 * 降低程序耦合度，提高了程序的扩展力
 */
public class Test {
    public static void main(String[] args) {
        Pet c = new Cat();  // 创建猫对象
        Pet b = new Brid();  // 创建鸟对象
        Pet d = new Dog();  // 创建鸟对象
        Master m = new Master(); // 创建主人对象
        m.feed(c);
        m.feed(b);
        m.feed(d);
    }
}
