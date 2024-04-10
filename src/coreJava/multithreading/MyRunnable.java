package coreJava.multithreading;

public class MyRunnable implements  Runnable{

    volatile  int  count =0;
    @Override
    public void run() {
      //  synchronized (this){
//            for(int i=0; i< 10; i++)
        while(count <10)
            {
                this.count++;
                System.out.println(Thread.currentThread().getName() + " : " + this.count);
            }
       // }


    }
}
