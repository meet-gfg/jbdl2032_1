package com.gfg.jbdl.domain;

import java.io.FileNotFoundException;

public interface Car {

    public void moveForward();

    public void start() throws FileNotFoundException;
    public void stop();

    // -> if method is marked default in interface, No compulsion to override in child class
    default public void startEv() {
        //something;
    }

}
