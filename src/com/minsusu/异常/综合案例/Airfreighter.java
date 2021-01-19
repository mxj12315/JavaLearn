package com.minsusu.异常.综合案例;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 货物运输机
 */
public class Airfreighter extends Weapon implements Movieable{
    @Override
    public void movie() {
        System.out.println("货物运输机在飞行");
    }

    @Override
    public String toString(){
        return "货物运输机";
    }
}
