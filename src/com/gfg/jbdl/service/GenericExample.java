package com.gfg.jbdl.service;

public class GenericExample {

    static class MyClass<A>{
        A a;
        A b;
    }


    public static void main(String[] args) {
       MyClass<Integer> my=new MyClass<>();
       my.a=10;
       //my.b="hi";
        MyClass<String> myString=new MyClass<>();
       // myString.a=10;
        myString.b="hi";
    }
}
