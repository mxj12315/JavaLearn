package com.minsusu.异常;

/**
 * 不使用异常
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        /*
        java.lang.ArithmeticException:/ by zero,不能被0除
        底层会自动new ArithmeticException异常对象
        ArithmeticException异常对象抛出，给main方法，
        main方法无法处理异常，将异常抛给JVM,JVM终止程序的执行
        ArithmeticException继承RuntimeException运行时异常，编译时候不需要对此异常进行处理
         */
        System.out.println(100/0);

        //这段代码不会执行
        System.out.println("hello world");
    }
}
