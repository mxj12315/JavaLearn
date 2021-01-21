package com.minsusu.序列化;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * 反序列化多个
 */
public class Student03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\sss"));
        //Object o = in.readObject();
        //System.out.println(o instanceof List);
        List<Student> o =(List<Student>) in.readObject();
        for(Student s:o){
            System.out.println(s);

        }

    }
}
