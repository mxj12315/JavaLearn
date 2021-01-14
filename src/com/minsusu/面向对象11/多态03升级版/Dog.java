package com.minsusu.面向对象11.多态03升级版;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Dog extends Pet{
    @Override
    public void eat(){
        System.out.println("小狗爱吃骨头");
    }
}
