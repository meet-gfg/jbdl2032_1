package com.gfg.jbdl.service;

public class GenericExample {

    static class MyClass<A>{
        A a;
        A b;
    }


    public static void main(String[] args) {
       //MyClass<Integer> my=new MyClass<>();
       MyClass<Number> my=new MyClass<>();
       my.a=10;
       //my.b="hi";
        MyClass<String> myString=new MyClass<>();
       // myString.a=10;
        myString.b="hi";
    }




    /*
    * 1. Pass a collection and get from value from it.
    * 2. Pass a collection and put a value into it.
    * 3. Pass a collection and do both get and put.
    *
    * */
}
