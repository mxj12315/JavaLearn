package com.minsusu.StringBufferAndStringBuilder;

/**
 * StringBuilder 字符串构建
 * 非多线程使用安全
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(123);
        stringBuilder.append("sagas");
        System.out.println(stringBuilder);
    }

}
