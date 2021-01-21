package com.minsusu.IO流.InputStreamTest01;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream文件输入流
 * 一次读取一个字节
 */
public class InputStreamTest01 {
    public static void main(String[] args) {
        // 放到外面。防止try执行报异常，finally中无法调用close方法
        FileInputStream fs = null;

        try {
            // 创建FileInputStream对象
            fs =  new FileInputStream("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\InputStreamTest01\\file");

            // 循环读取
            /*while (true){
                //read()下一个数据字节；如果已到达文件末尾，则返回 -1。
                int s = fs.read();
                //如果fs.read方法返回-1,表示读取到最后，跳出循环
                if (s == -1) break;
                // 执行到这里说明正常读取
                System.out.println(s);
            }*/

            // 循环读取，升级版
            int conount = 0;
            while ((conount = fs.read()) != -1){
                System.out.println(conount);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            // 判断输入流是否为空，不为空则执行关闭
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
