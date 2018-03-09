package threadDemo;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.concurrent.Semaphore;

class Shared{
    static int count=0;
}
class MyThread12 extends Thread{
   Semaphore semaphore;
   String threadName;

    public MyThread12( Semaphore semaphore, String threadName) {
        super(threadName);
        this.semaphore = semaphore;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        if (this.getName().equals("A")) {
            System.out.println("Starting thread " + threadName);
            try {
                System.out.println(threadName + "is waiting for permits ");
                // sem acquire the lock
                semaphore.acquire();
                for (int i = 0; i < 5; i++) {
                    Shared.count++;
                    System.out.println(threadName + " : " + Shared.count);
                    Thread.sleep(1000);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            //Release the permits
            System.out.println(threadName + "Release the permits ");
            semaphore.release();
        }
        else
        {
            System.out.println("Starting thread " + threadName);
            try {
                System.out.println(threadName + "is waiting for permits ");
                // sem acquire the lock
                semaphore.acquire();
                for (int i = 0; i < 5; i++) {
                    Shared.count++;
                    System.out.println(threadName + " : " + Shared.count);
                    Thread.sleep(1000);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            //Release the permits
            System.out.println(threadName + "Release the permits ");
            semaphore.release();
        }
    }
}
public class ShemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore=new Semaphore(1);

        MyThread12 t1=new MyThread12(semaphore,"A");
        MyThread12 t2=new MyThread12(semaphore,"B");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count "+Shared.count);

    }
}
