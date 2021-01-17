package com.minsusu.RandomTest;


import java.util.Arrays;
import java.util.Random;

/**
 * 随机数
 */
public class RandomTest01 {
    public static void main(String[] args) {
        Random r = new Random();
        int ss = r.nextInt();  //产生int范围内的随机数
        System.out.println(ss);

        int ss1 = r.nextInt(101);  //产生 1-100的随机数
        System.out.println("*****"+ss1);//18


        //插入不相同的数字放入数组
        int[] m = new int[5];
        for (int j = 0; j < m.length; j++) {
            m[j] = -1;
        }
        int i = 0;
        while (true) {
            int n = r.nextInt(101);
            System.out.println("生成的随机数"+n);
            if (!bs(m,n)){
                m[i]=n;
                i++;
                if (i==m.length){
                    break;
                }
            }
        }
        for (int data:m) {
            System.out.println(data);
        }
    }


    /**
     * 判断是否在数组中
     * @param arr  int[]
     * @param key  int
     * @return  int,大于-1则表示找到
     */
    public static boolean bs(int[] arr,int key){
        for (int data:arr) {
            if (data == key) return true; // 包含
        }
        return false;  // 不包含


    }
}
