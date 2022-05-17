package com.gfg.jbdl.service;



/*
* 1. concurrent
* 2. parallel
* 3. async
* */


import java.sql.SQLOutput;
import java.util.concurrent.Callable;

public class MyThread implements Callable{


    @Override
    public Object call() throws Exception {
        return null;
    }

//    @Override
//    public void run() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("in my thread run");
//       // System.out.println(Thread.currentThread());
//    }

}
