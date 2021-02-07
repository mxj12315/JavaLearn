package com.minsusu.Swing程序设计;

import javax.swing.*;
import java.awt.*;

/**
 * 标签JLabel和图标
 */
public class SwingTest03 implements Icon {
    private int height;
    private int width;
    /**
     * 无参构造
     */
    public SwingTest03(){    }

    /**
     *
     */
    public SwingTest03(int width, int height){
        this.height = height;
        this.width = width;
    }
    /**
     * 实现指定坐标位置画图
     * @param c 是一个具有图形表示能力的对象，可在屏幕上显示，并可与用户进行交互。典型图形用户界面中的按钮、复选框和滚动条都是组件示例。
     * @param g 是所有图形上下文的抽象基类，允许应用程序在组件（已经在各种设备上实现）以及闭屏图像上进行绘制。
     * @param x 位置
     * @param y 位置
     */
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,this.width,this.height);
    }

    /**
     * 获取图标的宽度
     * @return 图标宽度
     */
    @Override
    public int getIconWidth() {
        return this.width;
    }

    /**
     * 获取图标高度
     * @return 图标高度
     */
    @Override
    public int getIconHeight() {
        return this.height;
    }

    /**
     * main方法
     * @param args String数组
     */
    public static void main(String[] args) {
        SwingTest03 icon = new SwingTest03(15,15);
        // 创建一个JLabel组件，内部水平居中
        JLabel jLabel = new JLabel("图标",icon,SwingConstants.CENTER);
        // 创建窗体
        JFrame jFrame = new JFrame("图标窗体");
        // 窗体对象转化为容器
        Container container =jFrame.getContentPane();
        container.add(jLabel);
        jFrame.setSize(100,100);
        jFrame.setVisible(true);
        jFrame.setBackground(Color.white);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}



