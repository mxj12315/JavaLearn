package com.minsusu.序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化
 */
public class Student implements Serializable {
    //private static final long serialVersionUID=5646545646554654L;  //手动指定序列化版本号
    private int no;
    private int age;
    // transient瞬时的，不会被序列化
    private transient boolean b;
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    private static String name;


    public Student() {
    }

    public Student(int no) {
        this.no = no;
    }

    public String toString(){
        return Student.name+"**"+this.no;
    }

    public static void main(String[] args) throws IOException {
        Student s = new Student();
        s.no=123;
        Student.name = "张三";
        ObjectOutputStream o;
        o =new ObjectOutputStream(new FileOutputStream("D:\\ddd"));
        o.writeObject(s);  //序列化
        o.flush();
        o.close();
    }
}
