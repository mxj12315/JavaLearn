package com.minsusu.面向对象19.内部类01;


/**
 * 内部类
 * 局部内部类（包含匿名内部类）
 * 静态内部类 static修饰
 * 实例内部类
 */
public class InClass {
    /**
     * 静态内部类 static修饰
     */
    static class Inner1{}

    /**
     * 实例内部类
     */
    class Inner2{}

    public void doSome(){
        /**
         * 局部内部类
         */
        class Inner3{}
    }

    public void use(){
        // Inner3不能使用，是局部的
        new InClass().new Inner2();  // 访问实例内部类
    }
}
