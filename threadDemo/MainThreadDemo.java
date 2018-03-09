package threadDemo;

public class MainThreadDemo {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();

        // getting name of Main Thread
        System.out.println("Default thread Name"+thread.getName());

        // Changing name of main Thread
        thread.setName("Main Thread");
        System.out.println("After name is change "+thread.getName());

        // Getting priority of main thread
        System.out.println("Main Thread Priority "+thread.getPriority());

        //Setting Main Thread priority
        thread.setPriority(Thread.MAX_PRIORITY);

        //Get new priority
        System.out.println("Main thread new priority "+thread.getPriority());

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");

        }

        //Main thread creating child Thread
        ChildThread childThread=new ChildThread();
        //Name of child thread

        System.out.println("Name of the child thread is "+childThread.getName());
        //get Child thread Priority
        System.out.println("Child Thread Priority "+childThread.getPriority());

        // setting minimum priority to child thread

        childThread.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Child Thread new Priority "+childThread.getPriority());
        //starting child thread
        childThread.start();

    }
}
class ChildThread extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child Thread");
        }
    }
}
