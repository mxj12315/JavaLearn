package com.minsusu.数组02;

public class ArrayTest02 {
    public static void main(String[] args) {
        System.out.println("main函数的参数arg长度："+args.length);
        // args用于获取用户控制台输入  参数以空格隔开  abc xyz
        for (String data:args) {
            int i = 0;
            System.out.printf("args[%d] = %s\n",i++,data);
        }

        if (args.length !=2){
            System.out.println("请输入用户名和密码");
            return;
        }
        // if (args[0].equals("zhangsan")  && args[1].equals("123456")){
        if ("zhangsan".equals(args[0])  && "123456".equals(args[1])){  //防止空指针异常
            System.out.println("用户登录成功");
            System.out.println("欢迎"+args[0]+"回来！");
        }else {
            System.out.println("登录失败请检查用户名和密码");
        }


    }
}
