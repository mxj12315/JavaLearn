package com.minsusu.异常;


import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 异常案例
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        Regis regis = new Regis();
        try {
            regis.regisGo("1234567","passwd");
        } catch (com.minsusu.异常.userName userName) {
            userName.printStackTrace();
        }

    }
}

/**
 * 用户注册
 */
class Regis{
    public void regisGo(String u,String p) throws userName {
        if (null == u || u.length()<6 || u.length()>12){
            // 抛出异常
            throw new userName("用户名是【6-12】位的");
        }

        // 执行到这里说明用户名符合要求
        System.out.println("用户名正确，欢迎"+u+"使用");
    }
}

/**
 * 自定义编译时异常
 */
class userName extends Exception{
    public userName(){
    }

    public userName(String s){
        super(s);
    }
}



/**
 * 自定义运行时异常
 */
class userName1 extends RuntimeException{
    public userName1(){
    }

    public userName1(String s){
        super(s);
    }
}