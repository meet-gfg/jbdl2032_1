package com.gfg.jbdl.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<>();
        myList.add(10);
        myList.add(20);
        System.out.println(myList);
        myList.remove(0);

        System.out.println(myList);
//        List<Integer> myLinkedList=new LinkedList<>();
//        myLinkedList.add(10);
//        myLinkedList.add(20);
//
//        System.out.println(myLinkedList);

        List<Integer> myFinalList=List.of(1,2,3,4,5);  // cannot be modified
        List<Integer> myFinalList1= Arrays.asList(1,2,3,5);
        myFinalList.remove(0);

        /*Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
	at java.base/java.util.ImmutableCollections$AbstractImmutableList.remove(ImmutableCollections.java:258)
	at com.gfg.jbdl.service.CollectionExample.main(CollectionExample.java:25)*/





    }
}
