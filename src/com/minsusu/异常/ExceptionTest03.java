package com.minsusu.异常;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

/**
 * 获取异常信息：异常对象.getMessage()
 * 获取异常推栈信息：异常对象.printStackTrace()程序调试阶段
 */
public class ExceptionTest03 {
    public static void main(String[] args) {
        NullPointerException e = new NullPointerException("空指针异常");
        // throw new NullPointerException("空指针异常"); //手动抛异常
        //e.getMessage();  //获取异常信息
        e.printStackTrace();  // 适合程序调试阶段，异步线程执行
        System.out.println("hello world!");
    }
}
