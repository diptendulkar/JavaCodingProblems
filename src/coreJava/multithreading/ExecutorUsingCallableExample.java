package coreJava.multithreading;

import java.util.concurrent.*;

public class ExecutorUsingCallableExample {

static int counter =0;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {

                String str =  counter + " -> Message from : " + Thread.currentThread().getName();
                Thread.sleep(500);
                counter++;
                return str;
            }
        };

        // using callable Object
        for(int i=0; i< 20;i++){
            Future future = executorService.submit(callable);
            System.out.println(future.get().toString());
        }

        // USING Callable Method
        Future future = executorService.submit(getCallable(" Hello1"));
        System.out.println(future.get().toString());

        executorService.shutdown();
        while (!executorService.isTerminated()){}
        System.out.println(" ALL Thread Task Finished !!");
    }

    private static Callable getCallable(String msg){
        return  new Callable() {
            @Override
            public Object call() throws Exception {
                String str =  counter + " -> Message from : " + Thread.currentThread().getName() + " => " + msg;
                Thread.sleep(500);
                counter++;
                return str;
            }
        };
    }

}
