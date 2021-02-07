package com.minsusu.Swing程序设计;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 使用图片图标
 */
public class SwingTest04 extends JFrame {
    public SwingTest04(){
        // 调用父类的getContentPane()方法
        Container container =this.getContentPane();
        // 创建JLabel组件
        JLabel jLabel = new JLabel("这是一个JFrame窗体",JLabel.CENTER);
        // 获取图片所在的URL
        URL url = SwingTest04.class.getResource("imgButton.jpg");
        // 实例化图片图标
        Icon icon = new ImageIcon(url);
        // 为JBabel标签设置图标
        jLabel.setIcon(icon);
        // JLabel标签的文字居中
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        // 设置标签为不透明
        jLabel.setOpaque(true);
        // 将标签添加到容器
        container.add(jLabel);
        // 设置窗体大小
        this.setSize(250,100);
        // 设置窗体可见
        this.setVisible(true);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingTest04();
    }
}
