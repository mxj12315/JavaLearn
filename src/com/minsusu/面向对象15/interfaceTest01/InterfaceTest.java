package com.minsusu.面向对象15.interfaceTest01;

public class InterfaceTest {
    public static void main(String[] args) {
        D d  = new D();
        d.sum();


        // 多态
        A a = new D();
        if (a instanceof C){
            C c = (C) a;
            c.sum();
        }else if (a instanceof D){
            D f = (D) a;
            f.sumB();
        }

    }
}


interface A{

}
interface B{
    void sumB();
}
interface C extends A,B{
    //继承多个
    int a = 10;
    void sum();
}

class D implements C{
    @Override
    public void sum() {
        System.out.println("通过D类实现C接口");
    }

    @Override
    public void sumB() {
        System.out.println("通过D类实现B接口");
    }
}