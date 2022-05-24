package com.gfg.jbdl.service;

import java.util.concurrent.*;
/**
 *
 * Future are used for getting the output after the thread finishes the computation.
 * Ex:
 *  When any service is booked. we get a token(Future here in java) and we wait for our token number to come and get
 *  the service. Similar way Future ( intro in 1.5) waits and blocks the calling thread to get output when .get() is called
 *
 *  to avoid blocking in Java 1.8 Completable Future were introduced which implements Future and CompletionStage.
 *  It is a non-blocking call used with function which accepts consumer and supplier which needs to be processed after thread finishes
 *
 *  We use executorServices to manage thread rather than creating a custom new threads.
 *
 *
 *  Future cannot handle the checked exception while CompletableFuture are enhanced with handling the Checked exceptions.
 *
 * */

public class FutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println(" starting here with thread "+ Thread.currentThread().getName());
        ExecutorService service= Executors.newFixedThreadPool(5);

       /* Future<Integer> result =service.submit(() -> square(5));





        int a=result.get();

         System.out.println(result.get());
       ** --> this will wait for the thread methods to be finished. The above line is blocking call

        a=a+1; // logic here to perform after the result is done.
*/
        CompletableFuture<Integer> future=CompletableFuture.supplyAsync(() -> {
            try {
                return square(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 0;
        });

        future.thenApply(n -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("coming here in accept with thread" +Thread.currentThread().getName());
            return n+1;
        }).thenAccept(n -> {
            System.out.println(n);
        });
        System.out.println("done here"); // exec normally
        Thread.sleep(6000);


        // here submit the future task

        // go ahead with normal flow

        // send a confirmation

    }

    public static int square(int n) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(" in square here "+ Thread.currentThread().getName());
        return n*n;
    }
}
