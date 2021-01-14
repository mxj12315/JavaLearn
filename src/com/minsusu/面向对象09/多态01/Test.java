package com.minsusu.面向对象09.多态01;

public class Test {
    public static void main(String[] args) {
        // 过去的写法
        Cat c  = new Cat();
        c.go();       // 猫在睡觉
        c.arrest();   // 猫抓老鼠

        Brid b = new Brid();
        b.go();  // 鸟会飞

        Animal a = new Animal();
        a.go(); // 动物在跑
        System.out.println("***************************");
        /*
         *  1、cat与animal是继承关系，cat是子类，animal是父类
         *  2、cat类型转为animal属于向上转型upcasting
         *  3、java中允许父类型引用指向子类型对象
         */
        Animal s = new Cat();

        /*
         * 多态：
         *  1、程序在编译阶段：检测的变量s的类型是Animal，只有go()方法，称之为静态绑定
         *  2、程序在运行阶段：s变量指向的是一个Cat类型的对象，调用Cat中的go()方法，称之为动态绑定
         */
        s.go();


        /*
        *编译期报错，Animal类型没有arrest()方法
         */
        // s.arrest()


        /*
         * 向下转型：当子类型中的方法时是特有的，父类中没有，那么需要将Animal型转为Cat型
         * 需要添加强制类型转换符
         */
        Cat s1 = (Cat) s;
        s1.arrest();
        // or
        ((Cat) s).arrest();



        Animal s2 = new Brid();
        /**
         * 报错：java.lang.ClassCastException：类型转换异常，强制类型转换会发生异常
         * 1、编译阶段：可以通过  Animal类型变量s2指向Brid类型的引用，s2（Animal）和s3(Cat)两者之间存在继承关系
         * 2、运行阶段：无法运行，检测到s2变量指向的是Brid引用，但是Brid类型转换为Cat类型，出现报错
         * 3、向上转型一般不会出现错误
         * 4、向下转型可能出现类型转换错误的异常
         * 5、如何避免：
         *  5.1、语法格式
         *      (引用 instanceof 数据类型名)=>Boolean
         */
         // Cat s3 = (Cat) s2;  // 不安全的写法

        // 安全的写法
        if (s2 instanceof Cat){  // s2是一个Cat的对象？
            Cat s3 = (Cat) s2;
            s3.arrest();
        }else if (s2 instanceof Brid){  // s2是一个Brid的对象？
            Brid s3 = (Brid) s2;
            s3.fly();
        }

    }
}
