package coreJava.multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        //submit 10 task to be executed by Thread Pool

        for (int i = 0; i < 10; i++) {
            int taskId = i;
            Runnable task = new Runnable() {
                @Override
                public void run() {

                     try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Executing Task : " + taskId + " by " + Thread.currentThread().getName());



                }
            };
            // Submit the task to the executor service. This task will be executed by one of the pooled threads.
            executor.submit(task);
        }

        // Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted.
        executor.shutdown();
        // Wait for all tasks to finish execution before continuing with the main thread
        while (!executor.isTerminated()) {
            // Wait for all tasks to finish. This is a simple way to wait, but consider using awaitTermination for real-world applications
        }
        System.out.println("All tasks are finished!");
    }
}
