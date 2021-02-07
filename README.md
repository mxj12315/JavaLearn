package com.minsusu.Swing程序设计;

import javax.swing.*;
import java.awt.*;

/**
 * FlowLayout流式布局
 */
public class SwingTest06 extends JFrame {
    public SwingTest06() {
        this.setTitle("这是一个流式布局的窗体");
        // 创建容器
        Container container =this.getContentPane();
        // 指定布局
        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        // 循环添加按钮
        for (int i = 0; i < 10; i++) {
            container.add(new JButton("按钮"+i));
        }
        this.setVisible(true);
        this.setSize(300,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingTest06();
    }
}
