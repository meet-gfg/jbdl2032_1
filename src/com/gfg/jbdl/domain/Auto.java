package com.gfg.jbdl.domain;

import java.io.FileNotFoundException;

public class Auto implements Car,ThreeWheelVehcile{
    //when any of the method are added in interface, It will give compile time error if not handled here.
    //to avoid that we will either use default method in interface or override in this implementation

    @Override
    public void moveForward() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void controlHanlde() {

    }
}
