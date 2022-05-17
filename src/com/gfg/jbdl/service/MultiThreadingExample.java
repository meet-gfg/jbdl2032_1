package com.gfg.jbdl.service;

import com.gfg.jbdl.domain.Person;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MultiThreadingExample {

    /*
    * understand the context switching & swaping.
    * https://www.geeksforgeeks.org/difference-between-swapping-and-context-switching/
    * */

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread());

        System.out.println("Start");

        // Thread implements the runnable so it does not return anything, It fire and forget way.

        /*The Runnable interface is a functional interface and has a single run() method which doesn't accept any parameters and does not return any values.
        * Since the method signature does not have the “throws” clause specified, there is no way to propagate further checked exceptions.
        *
        * The Callable interface is a generic interface containing a single call() method – which returns a generic value V:
        * Callable's call() method contains “throws Exception” clause so we can easily propagate checked exceptions further:*/

        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();
        MyThread thread3=new MyThread();
        Long start=System.currentTimeMillis();

        /*ExecutorService is framework inbuilt to handle and limit the thread.
        * types of executors
            Single Thread Executor : A thread pool with only one thread. So all the submitted tasks will be executed sequentially. Method : Executors.newSingleThreadExecutor()

            Cached Thread Pool : A thread pool that creates as many threads it needs to execute the task in parrallel. The old available threads will be reused for the new tasks. If a thread is not used during 60 seconds, it will be terminated and removed from the pool. Method : Executors.newCachedThreadPool()

            Fixed Thread Pool : A thread pool with a fixed number of threads. If a thread is not available for the task, the task is put in queue waiting for an other task to ends. Method : Executors.newFixedThreadPool()

            Scheduled Thread Pool : A thread pool made to schedule future task. Method : Executors.newScheduledThreadPool()

            Single Thread Scheduled Pool : A thread pool with only one thread to schedule future task. Method : Executors.newSingleThreadScheduledExecutor()

*/
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        // task 1
        //task 2 // either runnable or callable
       // executorService.submit() is used to send runnable and callable.
        //callable will return a future object to .get() method will be used wait for task to finish.





        // big task T (0 -100)
            // thread t1 - 0-T` (0 -50)
            // thread t2  T` - T (51- 100)
        // t1.join()
        // t2.join()
        // go forward only after t1 & t2 are finished.

        // join is the instruction for the calling thread to wait for spwaned thread to be finished.
        // ---> .join() method .. indicate the main to wait for

        Thread.sleep(3000);

        Long end =System.currentTimeMillis();
        System.out.println("done in:"+(end-start));

    }
}
