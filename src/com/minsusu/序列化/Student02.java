package com.minsusu.序列化;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 序列化多个
 */
public class Student02 {
    public static void main(String[] args) throws  Exception{
        List<Student> list = new ArrayList<>();
        list.add(new Student(456));
        list.add(new Student(789));
        list.add(new Student(101));

        // 创建对象输出流对象
        ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("D:\\sss"));
        out.writeObject(list);  // 序列化
        out.flush();
        out.close();

    }
}
