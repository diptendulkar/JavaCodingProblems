package medium;
/*
Use 3 Thread to print in below sequence up to 10
T1 = 1,4,7,10
T2= 2,5,8
T3 = 3,6,9
*/

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Multithreading {

    static AtomicInteger counter = new AtomicInteger(0);
    static final CyclicBarrier barrier = new CyclicBarrier(3);

    private static void incrementCounter(int tNumber) {
        while (counter.get() <= 10) {
            if (counter.get() % 3 == tNumber - 1) { // Check thread's turn
                if(counter.get() <= 10)
                    System.out.println("T" + tNumber + " => " + counter.get());
                counter.getAndIncrement();

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            incrementCounter(1);

        });

        Thread t2 = new Thread(() -> {
            incrementCounter(2);

        });

        Thread t3 = new Thread(() -> {
            incrementCounter(3);

        });


        t1.start();
        t2.start();
        t3.start();


    }

}

