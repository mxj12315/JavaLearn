package com.minsusu.异常.综合案例;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 自定义异常对象
 */
public class AddWeaponException extends Exception{
    public AddWeaponException()
    {
        super();
    }

    public AddWeaponException(String s){
        super(s);
    }
}
