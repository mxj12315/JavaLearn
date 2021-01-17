package com.minsusu.StringBufferAndStringBuilder;


/**
 * StringBuffer字符串缓冲区，append方法底层会执行Arrays.copyOf()方法，对原数组进行拷贝扩容，释放源数组
 * 包含synchronized多线程使用安全
 */
public class StringBufferTest {
    public static void main(String[] args) {
        // 默认是16个字节
        StringBuffer _stringBuffer = new StringBuffer();
        _stringBuffer.append("abc");
        _stringBuffer.append("efg");
        _stringBuffer.append(false);
        _stringBuffer.append(100);
        _stringBuffer.append(2.5);
        System.out.println(_stringBuffer);  //abcefgfalse1002.5

    }

}
