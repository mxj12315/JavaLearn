package com.minsusu.异常;


/**
 * 自定义异常
 *
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
        MyException e = new MyException("这是自定义异常");
        e.printStackTrace();

        String s = e.getMessage();
        System.out.println(s);
    }
}

/**
 * 继承Exception编译时异常
 */
class MyException extends Exception{
    public MyException() {
        super();
    }

    public MyException(String s){
        super(s);
    }
}

/**
 * 继承RuntimeException运行时异常
 */
class MyException1 extends RuntimeException{
    public MyException1() {
        super();
    }

    public MyException1(String s){
        super(s);
    }
}

