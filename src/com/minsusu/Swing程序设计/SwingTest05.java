package com.minsusu.Swing程序设计;

import javax.swing.*;
import java.awt.*;

/**
 * 绝对布局
 */
public class SwingTest05 extends JFrame {
    public SwingTest05(){
        // 设置窗体的标题
        this.setTitle("局对布局窗体");
        // 取消窗体的布局管理设置
        this.setLayout(null);
        // 设置窗体的位置大小
        this.setBounds(0,0,200,150);
        // 创建一个容器对象
        Container container = this.getContentPane();
        // 创建两个button组件
        JButton jb1 = new JButton("按钮1");
        JButton jb2 = new JButton("按钮2");
        // 设置按钮大小
        jb1.setBounds(10,30,80,30);
        jb2.setBounds(60,70,100,30);
        // 添加按钮到容器
        container.add(jb1);
        container.add(jb2);
        // 设置可见性
        setVisible(true);
        // 设置关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new SwingTest05();
    }
}
