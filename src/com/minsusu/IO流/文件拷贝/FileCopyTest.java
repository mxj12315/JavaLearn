package com.minsusu.IO流.文件拷贝;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
    public static void main(String[] args) {
        FileInputStream infs = null;
        FileOutputStream outfs =null;
        try {
            infs = new FileInputStream("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\文件拷贝\\2243690-9cd9c896e0d512ed.gif");
            outfs =new FileOutputStream("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\文件拷贝\\2243690copy.gif");
            byte[] bytes =new byte[4];
            int count = 0 ;

            while ((count= infs.read(bytes))!=-1){
                //读到多少写多少
                outfs.write(bytes,0,count);
            }

            // 刷新输出流
            outfs.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //分开关闭，一起关闭可能会导致另一个出问题
            if (infs!=null){
                try {
                    infs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if (outfs!=null){
                try {
                    outfs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
