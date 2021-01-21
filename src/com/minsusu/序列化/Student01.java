package com.minsusu.序列化;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 反序列化
 */
public class Student01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\ddd"));
        Object o = in.readObject();
        System.out.println(o);
    }
}
