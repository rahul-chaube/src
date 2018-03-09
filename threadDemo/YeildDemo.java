package threadDemo;


class MyThread extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " in Control");

        }
    }
}
public class YeildDemo {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        for (int i = 0; i < 5; i++) {
            Thread.yield();
            for (int j = 0; j <5 ; j++) {
                System.out.println(Thread.currentThread().getName()+"  in Control ");
            }

        }
    }
}
