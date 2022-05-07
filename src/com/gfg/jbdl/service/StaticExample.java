package com.gfg.jbdl.service;

public class StaticExample {

    /*
    * if a is static, there will be only one copy of a throughout the project which is with class
    *  any changes in a will be done with class name like "StaticExample.a" not with any of the object
    * */

     static int a;


    /*
    * Static blocks are called before the constructor. They are used to do any initialization of the static members of the class
    * */
     static{
         a=10;  // -> static a is updated here
         System.out.println("in static block");
     }

    public StaticExample() {

         System.out.println("in const");
    }
}
