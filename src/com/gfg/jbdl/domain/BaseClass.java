package com.gfg.jbdl.domain;

import java.io.FileNotFoundException;

public class BaseClass {

    //if base class throws RunTimeException then compile time it will not show to handle. If its compile time it needs to be handled
    public int add(int a,int b) throws NullPointerException{
        return a + b;
    }

    public int subtract(int a,int b) throws FileNotFoundException {
        return a + b;
    }
}
