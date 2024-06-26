package coreJava.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/*
WAP - three threads print numbers 1 to 10 in the following sequence:
T1 -> 1,4,7,10
T2 -> 2,5,8
T3 -> 3,6,9
* */
public class ThreadCounter {
    private static AtomicInteger counter = new AtomicInteger(0);

    //   static final CyclicBarrier cyclicB = new CyclicBarrier(3);
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> task(0));
        Thread t2 = new Thread(() -> task(1));
        Thread t3 = new Thread(() -> task(2));
        t1.start();
        t2.start();
        t3.start();
    }

    private static void task(int tId) {
        while (counter.get() <= 10) {
            if (counter.get() % 3 == tId) { // Check thread's turn
                counter.getAndIncrement();
                if (counter.get() <= 10)
                    System.out.println("T" + tId + " => " + counter.get());


            }
        }
    }
}
