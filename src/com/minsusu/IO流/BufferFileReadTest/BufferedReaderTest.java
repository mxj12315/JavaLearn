package com.minsusu.IO流.BufferFileReadTest;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

/**
 * 自带缓冲，读取时不需要定义byte[]或者char[]
 */
public class BufferedReaderTest {
    public static void main(String[] args)  throws Exception{
        BufferedReader bf = null;
        FileReader fs = new FileReader("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\BufferFileReadTest\\bs.txt");

        bf =new BufferedReader(fs);
       String s= null;
        while ((s= bf.readLine())!=null){
            System.out.println(s);
        }

        //会自动关闭传入的其他流,定向输出控制台信息
        bf.close();
        System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\BufferFileReadTest\\bs.txt",true)));
        System.out.println("agdagasg");
        System.out.println("hello world！");
    }
}
