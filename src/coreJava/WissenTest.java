package coreJava;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WissenTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        q1();
        Q1_a();


    }

    public static void  q1() throws ExecutionException, InterruptedException {
        //You're creating a new Thread object explicitly.
        // Thread pools are designed to manage a pool of reusable threads.
        // Here, the thread is created and then submitted to the pool, which isn't very efficient.
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
               // return 10 ;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        ExecutorService ex = Executors.newFixedThreadPool(1);
        Future<Integer> future = (Future<Integer>) ex.submit(thread);
        System.out.println(future.get());

    }

    public static void Q1_a() throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(1);

// Implement your task (logic) here
        Future<Integer> future = ex.submit(() -> {
            try {
                Thread.sleep(1000);
                return 48;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println(future.get());

// Shutdown the thread pool after use
        ex.shutdown();
    }

    public  static void Q2(){
        // Maximum Increasing subsequence length e.g. [1,20,200,2,3,5] – 3 [1,2,3]

    }

}
