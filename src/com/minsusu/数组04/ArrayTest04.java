package com.minsusu.数组04;

public class ArrayTest04 {
    public static void main(String[] args) {
        int[] src = {1,22,33,44,55};  // 要拷贝的源数组
        int[] dist =new int[20]; // 动态数组，拷贝的目标
        // arraycopy(源数组，元素组的起点，目标数组，目标数组的位置，拷贝的长度)
        // 部分拷贝
        /*
        System.arraycopy(src,2,dist,5,2);
        for (int i=0;i< dist.length;i++){
            System.out.println(dist[i]);
        }
         */
        // 全部拷贝
        System.arraycopy(src,0,dist,0,src.length);
        for (int i=0;i< dist.length;i++){
            System.out.println(dist[i]);
        }

    }
}
