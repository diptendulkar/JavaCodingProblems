package coreJava.multithreading;

public class MyRunnable implements  Runnable{

      int  count =0;
    @Override
    public void run() {
        synchronized (this){
            for(int i=0; i< 10; i++){
                this.count++;
            }
        }

        System.out.println(Thread.currentThread().getName() + " : " + this.count);
    }
}
