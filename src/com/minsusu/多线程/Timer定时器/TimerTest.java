package com.minsusu.多线程.Timer定时器;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();

        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        try {
          Date date =s.parse("2021-01-22 16:37:00");
          //schedule(定时任务，第一次执行时间，间隔多久)
          timer.schedule(new LogTask(),date,1000*10);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}


class LogTask extends TimerTask{

    @Override
    public void run() {
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String formatTime = s.format(new Date());
        System.out.println(formatTime + " 定时任务！");
    }
}
