package com.minsusu.异常.综合案例;

/**
 * 高射炮
 */
public class Archibald extends Weapon implements Shootable{
    @Override
    public void shoot() {
        System.out.println("高射炮开火");
    }

    @Override
    public String toString() {
        return "高射炮";
    }
}
