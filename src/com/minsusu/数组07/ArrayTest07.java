package com.minsusu.数组07;


import java.util.Arrays;

/**
 * java.util.Arrays工具类
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 12, 0, 56, 78, 662, 456};
        Arrays.sort(arr);
        for (int data : arr) {
            System.out.println(data);
        }
        //binarySearch()方法的返回值为：1、如果找到关键字，则返回值为关键字在数组中的位置索引，且索引从0开始2、
        // 如果没有找到关键字，返回值为负的插入点值，所谓插入点值就是第一个比关键字大的元素在数组中的位置索引，而且这个位置索引从1开始。
        int index = Arrays.binarySearch(arr, 13);  //查找元素所在的索引值，没有只返回-1
        System.out.println(index);
        System.out.println(index == -1
                ? "元素不在数组中"
                : "元素的索引是" + index);
    }
}
