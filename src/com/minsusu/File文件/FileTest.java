package com.minsusu.File文件;

import java.io.File;
import java.io.IOException;

/**
 * File文件目录的抽象形式
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\File文件\\new");
        if (!f.exists()){ // 不存在则创建
            f.createNewFile();  //创建文件
        }
        File f1 = new File("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\File文件\\news");

        if (!f1.exists()){
            f1.mkdir();  // 创建文件夹
        }
        File f2 = new File("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\File文件\\a\\b\\c");

        if (!f2.exists()){
            f2.mkdirs();  // 创建文件夹
            System.out.println(f2.getPath());
            System.out.println(f2.getAbsolutePath());
        }
    }
}
