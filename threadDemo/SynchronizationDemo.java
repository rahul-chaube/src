package threadDemo;

class Sender
{
    public void send(String msg)
    {
        System.out.println("Sending \t "+msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("\n "+msg + "  send");
    }
}
class ThreadSend extends Thread {
    private String msg;
    private Thread t;
    Sender sender;

    public ThreadSend(String msg, Sender sender) {
        this.msg = msg;

        this.sender = sender;
    }

    @Override
    public void run() {
        sender.send(msg);

        synchronized (sender)
        {
            sender.send(msg);
        }
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        Sender sender=new Sender();
        ThreadSend s1=new ThreadSend("Hii ",sender);
        ThreadSend s2=new ThreadSend("Bye",sender);
        s1.start();
        s2.start();

        try {
            s1.join();
            s2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
