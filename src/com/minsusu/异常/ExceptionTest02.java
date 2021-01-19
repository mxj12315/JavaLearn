package com.minsusu.异常;


/**
 * 使用异常上报,或者使用try catch
 */
public class ExceptionTest02 {
   /* public static void main(String[] args) throws ClassNotFoundException {
        ExceptionTest02.divide();  // 未处理异常会报错

    }*/

    public static void main(String[] args)  {
        try {
            ExceptionTest02.divide();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static int divide() throws ClassNotFoundException{
         return 1;
    }


}

