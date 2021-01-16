package com.minsusu.数组01;

public class ArrayTest01 {
    public static void main(String[] args) {
        // 定义数组
        int[] a = new int[5];  // 动态初始化
        // or
        int ab[] = new int[3];  // c++ 方式定义赋值

        a[0]=4564;
        System.out.println(a);
        // 正向遍历
        for (int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("**************");
        // 逆向遍历
        for (int i = a.length-1; i>=0;i--){
            System.out.println(a[i]);
        }
        System.out.println("**************");

        int[] c = {1,2,3,4};
        ArrayTest01.arraylist(c);

        String[] name = {"张三","李四","王五"};  // 静态初始化
        System.out.println(name[1]);  //李四
        System.out.println(name[name.length-1]);  // 最后一个元素
        name[0]="发发发";
        // System.out.println(name[5]);  //java.lang.ArrayIndexOutOfBoundsException:数组越界
    }


    public static void arraylist(int[] args){
        //foreach
        int i = 0;
        for (int data:args) {
            System.out.printf("args[%d]=%d\n",i++,data);
        }
    }
}
