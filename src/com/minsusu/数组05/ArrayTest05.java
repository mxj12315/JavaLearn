package com.minsusu.数组05;


/**
 * 二维数组
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        int[] a2 = {55,88,99};
        int[] a3 = {55,88,99,111};
        int[][] arr = {a1,a2,a3}; // 二维数组
        int[][] arr1 = {a1,a2}; // 二维数组
        int[][] arr2 = new int[2][3];//表示新建一个数组，有两个长度为3的数组

        // 遍历二位数组
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("--第"+(i+1)+"个数组---");
        }
        System.out.println(arr[0][2]);  //3

        // 三维数组
        int[][][] b = {
                {{1,2,3},{1,2,3}},
                {{3,4,1},{2,3,4}}
        };
        System.out.println(b[1][1][2]);//4
        int[][][] ss = {arr,arr1};
    }
}
