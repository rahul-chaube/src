package threadDemo;

public class SleepDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" in Control");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new SleepDemo());
        System.out.println("**** Thread One Started ******* ");
        thread.start();
        Thread thread1=new Thread(new SleepDemo());
        System.out.println("**** Thread Two Started ******* ");

        thread1.start();
    }
}
