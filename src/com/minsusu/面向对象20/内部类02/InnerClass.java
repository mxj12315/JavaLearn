package com.minsusu.面向对象20.内部类02;

public class InnerClass {
    public static void main(String[] args) {

        /* 方式一：使用InterfaceComputer类实现接口
        MyMath mm = new MyMath();
        mm.mySum(new InterfaceComputer(),100,300);//100+300=400
         */

        // 方式二：使用匿名内部类实现
        MyMath mm = new MyMath();
        // new Computer()本身接口不能new,后面的{}，是对接口内的抽象方法实现
        mm.mySum(new Computer() {
            // 接口内的抽象方法实现
            public int sum(int a, int b) {
                return a + b;
            }
        }, 100, 300);  //100+300=400
        // or  使用映射
        mm.mySum((a, b) -> a + b, 100, 300);//100+300=400
    }

}


/**
 * 接口
 */
interface Computer {
    int sum(int a, int b);
}


/**
 * Computer接口的实现
 */
class InterfaceComputer implements Computer {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}


/**
 * MyMath类
 */
class MyMath {
    public void mySum(Computer c, int x, int y) {
        System.out.println(x + "+" + y + "=" + c.sum(x, y));
    }
}