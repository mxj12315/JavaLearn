package com.minsusu.IO流.InputStreamTest01;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream文件输入流
 *  read(byte[] b) 从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中
 */
public class InputStreamTest02 {
    public static void main(String[] args) {
        // 放到外面。防止try执行报异常，finally中无法调用close方法
        FileInputStream fs = null;


        // 创建FileInputStream对象
        try {
            fs = new FileInputStream("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\InputStreamTest01\\file");

            int count = 0;
            // read(byte[] b) 从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中
            byte[] bytes = new byte[4];
            while ((count = fs.read(bytes))!=-1){
                //String(byte[] bytes, int offset, int length) 通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。
                System.out.print(new String(bytes,0, count));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fs!=null) {
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
