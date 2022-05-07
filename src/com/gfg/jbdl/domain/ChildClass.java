package com.gfg.jbdl.domain;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ChildClass extends BaseClass{

/*
* if the child class overridden does not throw exception, it is fine but if throws diffrent type of exception it is
* invalid overridden method.
* it's shows compile time error with checked exceptions while not with run time exceptions.
* */

    @Override
    public  int add(int a,int b) throws NullPointerException {
        return a+b;
    }

 /*
    -> Erroneous code because of checked Exception
    @Override
    public int subtract(int a,int b) throws SQLException {
        return a - b;
    }*/

    // -> no error here because NullPointer is run time exception
     @Override
     public int subtract(int a,int b) throws NullPointerException {
         return a - b;
     }
}
