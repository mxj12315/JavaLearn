package com.minsusu.泛型;

/*public class ZidingyiFanxing<泛型标识符> {

    public  void sum(泛型标识符 o){
        // do some thing
    }
}*/


public class ZidingyiFanxing<T> {
    public static void main(String[] args) {
        ZidingyiFanxing<String> zdy = new ZidingyiFanxing<>();
        zdy.sum("sngg");
        // zdy.sum(123); //错误的，只能传递String类型

        ZidingyiFanxing<Animals> animals = new ZidingyiFanxing<>();
        Animals b = animals._sum();

        // 定义泛型，但是未使用泛型，sum（）方法需要传入Object类型
        ZidingyiFanxing animals1 = new ZidingyiFanxing();
        animals1.sum(new Animals());


    }

    public  void sum(T o){
        // do some thing
    }

    /**
     *
     * @return <T>
     */
    public T _sum(){
        return null;
    }
}

class Animals{
    // <E>是定义泛型
    public <E> E dosome(E p){
        return p;

    }
}