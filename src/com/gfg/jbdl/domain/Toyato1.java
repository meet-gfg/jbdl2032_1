package com.gfg.jbdl.domain;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Toyato1 implements Car{


    @Override
    public void moveForward() {

    }

    @Override
    public void start(){

    }

    @Override
    public void stop() {

    }

   /*
    --> as the method is marked as default in interface, it is okay to not have defination here.
    the default method body in interface will be used indirectly here by inheritance.
    @Override
    public void startEv(){
        //my ev logic;
    }
*/
}
