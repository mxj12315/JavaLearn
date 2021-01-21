package com.minsusu.IO流;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties专门配置属性配置的类
 */
public class ioProperties {
    public static void main(String[] args) throws IOException {
        // 读取info文件到对象中
        FileReader fs =new FileReader("C:\\Users\\mxj12315\\Desktop\\IdeaProjects\\untitled1\\src\\com\\minsusu\\IO流\\info.properties");

        //新建map集合
        Properties properties =new Properties();
        // 加载数据到map集合，等号左边做key,右边做value
        properties.load(fs);

        // 通过key获取value
        String userName = properties.getProperty("uerName");  // 获取用户名
        String passwd = properties.getProperty("password");  // 获取密码
        String Birthday = properties.getProperty("Birthday");  // 获取生日
        System.out.println("用户名："+userName+" 密码："+passwd+" 生日："+Birthday);  //用户名：admin 密码：123456 生日："asgas"

    }

}
