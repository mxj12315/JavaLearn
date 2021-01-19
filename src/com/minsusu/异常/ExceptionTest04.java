package com.minsusu.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * finally使用，关闭文件输入流
 */
public class ExceptionTest04 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("E:\\暂时存放\\毕业证和学位证.jpg");
            System.out.println("hello world");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("hello finally");
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
