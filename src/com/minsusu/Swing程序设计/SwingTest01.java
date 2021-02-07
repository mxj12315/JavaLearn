package com.minsusu.Swing程序设计;

import javax.swing.*;
import java.awt.*;


/**
 * JFrame窗体
 */
public class SwingTest01 extends JFrame {
    public static void main(String[] args) {
        SwingTest01 sw = new SwingTest01();
        sw.CreateJFrame("这是创建的窗体");

    }
    public void CreateJFrame(String title){
        // 创建JFrame对象容器
        JFrame jf =new JFrame(title);
        // 获取一个容器，将窗体转化为容器
        Container container=jf.getContentPane();
        // 创建一个JLabel标签
        JLabel jLabel = new JLabel("这是一个JFrame窗体");
        // 使标签中的文本居中
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        // 将标签添加到容器
        container.add(jLabel);
        // 设置容器的背景色
        container.setBackground(Color.white);
        // 设置容器可见
        jf.setVisible(true);
        // 设置容器的尺寸
        jf.setSize(200,150);
        // 设置容器的关闭方式
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
