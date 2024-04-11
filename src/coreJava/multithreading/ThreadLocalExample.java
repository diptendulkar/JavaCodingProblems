package coreJava.multithreading;

public class ThreadLocalExample {
    public static void main(String[] args) {

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();

        Thread t1 = new Thread( () ->{

            threadLocal.set(" I am from Thread 1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(threadLocal.get());
        });

        Thread t2 = new Thread( () ->{

            threadLocal.set(" I am from Thread 2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(threadLocal.get());
            threadLocal.remove(); // removes the value stored by this thread
        });

        t1.start();
        t2.start();


        //**** InheritableThreadLocal EXAMPLE ******** //
        // A child Thread can access only InheritableThreadLocal not Threadloacal

        Thread parentThread = new Thread(() -> {
            System.out.println(" ===== PARENT THREAD ====");
            threadLocal.set(" I am Parent Thread");
            inheritableThreadLocal.set(" I am InheritableThreadLocal ");

            System.out.println(threadLocal.get());
            System.out.println(inheritableThreadLocal.get());

            Thread childThread = new Thread(() ->{
                System.out.println(" ===== CHILD THREAD ====");
                System.out.println("ThreadLocal Value is : " +threadLocal.get());
                System.out.println("InheritableThreadLocal Value is : " +inheritableThreadLocal.get());

            });
            childThread.start();
        });
        parentThread.start();

    }
}
