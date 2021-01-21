package com.minsusu.IO流.FileWriteTest;

import java.io.FileWriter;
import java.io.IOException;


/**
 * FileWriter写入文本
 */
public class FileWriteTest01 {
    public static void main(String[] args) {
        FileWriter fs = null;
        try {
            fs = new FileWriter("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\FileWriteTest\\fs.txt");
            /*char[] chars = {'我','是','中','国','人'};
            fs.write(chars);*/
            String s ="张三李四网技术国家安定高考大捷萨克高科技啊";
            fs.write(s);
            fs.flush();
        } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
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
