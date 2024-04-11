package coreJava.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLockExample {

    public static void main(String[] args) {
        CounterLockExample counterLockExample = new CounterLockExample();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counterLockExample.inc();

                System.out.println(Thread.currentThread().getName() + " => " + counterLockExample.getCount());
            }

        });


        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counterLockExample.inc();

                System.out.println(Thread.currentThread().getName() + " => " + counterLockExample.getCount());
            }
        });

        t1.start();
        t2.start();


    }

    private long counter = 0;
    private Lock myLock = new ReentrantLock(false);

    public void inc() {
        try {
            myLock.lock();
            this.counter++;
        } finally {
           // myLock.unlock(); // can be  unlock in another function
        }
    }

    public long getCount() {
        try {
           // myLock.lock(); // can be  unlock in another function
            return this.counter;
        } finally {
            myLock.unlock();
        }

    }
}
