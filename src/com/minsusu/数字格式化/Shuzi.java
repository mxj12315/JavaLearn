package com.minsusu.数字格式化;

import java.text.DecimalFormat;

public class Shuzi {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.##");
        String aa  = df.format(12345.12);
        System.out.println(aa);  //12,345.12

        DecimalFormat df2 = new DecimalFormat("###,###.000");
        String bb = df2.format(456444.4);
        System.out.println(bb);  //456,444.400

    }
}
