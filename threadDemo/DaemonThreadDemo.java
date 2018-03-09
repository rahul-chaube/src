package threadDemo;

class MyDeamon extends Thread{
    @Override
    public void run() {
        super.run();
        if (Thread.currentThread().isDaemon())
        {
            System.out.println("This is the daemon Thread ");
        }else
        {
            System.out.println("This is the User Thread ");
        }
    }
}
public class DaemonThreadDemo {



    public static void main(String[] args) {
        MyDeamon deamon1 =new MyDeamon();
        MyDeamon deamon2 =new MyDeamon();
        MyDeamon deamon3 =new MyDeamon();

        MyDeamon deamon4 =new MyDeamon();
        deamon1.start();
        deamon2.start();
        deamon3.setDaemon(true);
        deamon3.start();
        deamon4.start();
    }


}
