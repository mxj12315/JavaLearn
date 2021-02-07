package com.minsusu.Swing程序设计;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JDialog窗体
 *  弹出框
 */
public class SwingTest02 extends JFrame {
    /**
     * 构造方法
     */
    public SwingTest02(){
        // 创建一个一个窗体，getContentPane（）转化为一个容器
        Container container = this.getContentPane();
        // 设置此容器的布局管理器
        container.setLayout(null);
        // 创建一个标签组件
        JLabel jLabel = new JLabel("这是一个JFrame窗体");
        // 设置标签中文字的位置
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        // 将组件添加到容器中
        container.add(jLabel);
        // 创建一个JButton组件
        JButton jButton =new JButton("弹出对话框");
        // 移动组件并调整其大小。
        jButton.setBounds(50,200,100,21);
        // 为组建添加监听事件：鼠标单击,使用匿名内部类
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 使得MyJDialog窗体可见,wingTest02.this指内部类addActionListener括号中的匿名类
                new MyJDialog(SwingTest02.this).setVisible(true);
            }
        });
        container.add(jButton);
        this.setVisible(true);
        System.out.println(this);
        this.setSize(500,600);
        this.setBackground(Color.white);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        new SwingTest02();
    }
}


class  MyJDialog extends JDialog{
    public MyJDialog(){

    }
    public MyJDialog(SwingTest02 frame){
        // 实例化一个JDialog对象，指定其拥有者，标题，类型
        super(frame,"第一个JDialog窗体",true);
        // 将窗体转为容器
        Container container =this.getContentPane();
        // 向容器中添加组件
        container.add(new JLabel("这是一个对话框"));
        // 设置容器的大写
        setBounds(300,300,100,100);
        setSize(200,200);
    }
}