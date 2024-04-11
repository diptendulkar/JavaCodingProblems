package coreJava.multithreading;

public class MyRaceCondition {

    static Counter counter = new Counter();


    public static void main(String[] args) {

        // RACE CONDITION AS BOTH THE THREADS ACCESS SAME COUNTER OBJECT

        Thread t1 = new Thread(getRunnable(counter, "Thread 1 Final Count : "));
        Thread t2 = new Thread(getRunnable(counter, "Thread 2 Final Count : "));

        t1.start();
        t2.start();
    }

    private static Runnable getRunnable(Counter counter, String message) {
        return () -> {
            for (int i = 0; i < 10; i++) {
                counter.incAndGet();
            }
            System.out.println(message + counter.get());
        };
    }
}
