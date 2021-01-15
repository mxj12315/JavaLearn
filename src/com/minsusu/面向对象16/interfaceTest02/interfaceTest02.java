package com.minsusu.面向对象16.interfaceTest02;

public class interfaceTest02 {
    public static void main(String[] args) {
        B m = new C();
        /**
         * B类型和A类型无任何关系
         * B类型强制转换A类型，编译阶段不会报错，和一般的多态有区别
         * 运行阶段会抛出异常： java.lang.ClassCastException
         */
        A m1 = (A) m;
    }
}


interface A {

}

interface B {

}

class C implements B{

}