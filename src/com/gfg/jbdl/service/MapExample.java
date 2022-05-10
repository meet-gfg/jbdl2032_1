package com.gfg.jbdl.service;

import com.gfg.jbdl.domain.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("Meet");
        p1.setId("123");
        Person p2=new Person();
        p2.setId("123");
        p2.setName("Meet");
        Person p3=new Person();
        p3.setId("123");
        p3.setName("Meet");
        Person p4=new Person();
        p4.setId("1234");
        p4.setName("Meet");

//        Set<Person> personList=new HashSet<>();
//        personList.add(p1);
//        personList.add(p2);
//
//        System.out.println(personList);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());

    }
}
