package com.minsusu.IO流.FileReadTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * FileReader以字符的方式读取文本文件
 */
public class FileReadTest {
    public static void main(String[] args) {
        FileReader fs = null;
        try {
            fs = new FileReader("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\FileReadTest\\fileread.txt");
            char[] chars =new char[8];
            int count =0;
            while ((count= fs.read(chars))!=-1){
                System.out.print(new String(chars,0,count)); //aijgbdjsangkja你空间大姑娘抗空间大
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fs!=null){
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
