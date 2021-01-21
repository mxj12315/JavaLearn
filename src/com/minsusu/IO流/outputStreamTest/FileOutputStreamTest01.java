package com.minsusu.IO流.outputStreamTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream文件字节输出流
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fs = null;
        //FileOutputStream(String name) 创建一个向具有指定名称的文件中写入数据的输出文件流。
        try {
            fs = new FileOutputStream("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\outputStreamTest\\add",true);
            // void	write(byte[] b) 将 b.length 个字节从指定 byte 数组写入此文件输出流中。
            byte[] bytes = {97, 98, 99, 100,101,127};
            fs.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fs != null) {
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
