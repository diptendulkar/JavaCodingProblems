package coreJava.multithreading;

public class MyThread {
    public static void main(String[] args) {

        MyRunnable runnable1 = new MyRunnable();
        MyRunnable runnable2 = new MyRunnable();

        // As runnable object are diffrent both threads works independetly on count
        Thread t1 = new Thread(runnable1,"Thread 1");
        Thread t2 = new Thread(runnable2,"Thread 2");

        t1.start();
        t2.start();
    }
}
