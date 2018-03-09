package threadDemo;

import java.util.Scanner;

public class WaitNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        final PC pc=new PC();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.procedure();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consumr();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
    public static class PC{
        public void procedure() throws InterruptedException {
            // synchronized block ensure that only one thread running at time
           synchronized (this) {
               System.out.println("Procedure thread is running "+
               Thread.currentThread().getName());
               // release the lock to share resource
               wait();
               // and wait till other invoked notify
               System.out.println("Resume ");
           }
        }
        public void consumr() throws InterruptedException {
            Thread.sleep(1000);
            Scanner scanner=new Scanner(System.in);
            // synchronized block ensure the only one thread is running
            synchronized (this)
            {
                System.out.println("waiting for return key "+Thread.currentThread().getName());
                scanner.next();
                System.out.println("Return key pressed");

                //Notify the procedure thread that it can wake up
                notify();
                // sleep
                Thread.sleep(2000);

            }
        }
    }
}

