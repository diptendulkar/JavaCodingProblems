package coreJava.multithreading;

public class Counter {

    private long counter =0;

    public long incAndGet(){
        this.counter ++;
        return  this.counter;
    }

    public long get(){
        return  this.counter;
    }
}
