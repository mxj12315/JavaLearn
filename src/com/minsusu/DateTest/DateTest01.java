package com.minsusu.DateTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class DateTest01 {
    public static void main(String[] args) {
        long i = System.currentTimeMillis();
        Date d = new Date(15588l);
        System.out.println(d.toString());  //Thu Jan 01 08:00:15 CST 1970
        Date dNow = new Date( );  //分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");

        System.out.println("当前时间为: " + ft.format(dNow));  //当前时间为: 2021-01-17 11:30:48
        for (int j = 0; j<1000000000;j++){
            String a ="adng";
            a+="sgdfs";
        }
        // 返回以毫秒为单位的当前时间。注意，当返回值的时间单位是毫秒时，值的粒度取决于底层操作系统，并且粒度可能更大。例如，许多操作系统以几十毫秒为单位测量时间
        long i1 = System.currentTimeMillis();
        System.out.println(i1-i);


    }
}
