package com.minsusu.Math包高精度;

import java.math.BigDecimal;

/**
 * BigDecimal高精度的数字,适用于财务类的软件
 */
public class MathTest {
    public static void main(String[] args) {
        BigDecimal b = new BigDecimal(100);
        BigDecimal b1 = new BigDecimal(200);
        BigDecimal b2 = b.add(b1);  //求和
        System.out.println(b2);


    }
}
