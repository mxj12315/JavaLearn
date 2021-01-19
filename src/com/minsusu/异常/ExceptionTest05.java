package com.minsusu.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * try直接和finally使用
 *
 */
public class ExceptionTest05 {
    public static void main(String[] args) {
        /**
         * 以下代码先执行try
         * 在执行finally
         * 最后执行return
         */
        try{
            System.out.println("hello try");
            return;
            // System.exit(0);  //如果使用这条代码，finally中的代码不会再执行
        }finally {
            System.out.println("hello finally");
        }

        //System.out.println("hello end");  //这里不会执行
    }
}
