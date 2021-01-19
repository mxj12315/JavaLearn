package com.minsusu.异常.综合案例;

import org.omg.CORBA.PUBLIC_MEMBER;

public class AddWeaponException extends Exception{
    public AddWeaponException()
    {
        super();
    }

    public AddWeaponException(String s){
        super(s);
    }
}
