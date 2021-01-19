package com.minsusu.异常.综合案例;


/**
 * 新建坦克类
 */
public class Tank extends Weapon implements Movieable,Shootable{
    public static int count = 0;
    @Override
    public void movie() {
        System.out.println("坦克在移动");
    }

    @Override
    public void shoot() {
        count ++;
        System.out.println("坦克"+count+"攻击");
    }

    @Override
    public String toString() {
        return "坦克";
    }
}
