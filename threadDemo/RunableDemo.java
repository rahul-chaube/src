package threadDemo;

class MultiThreadingDemo implements Runnable{

    @Override
    public void run() {
        System.out.println(" Running "+Thread.currentThread().getName()+" is running ");
    }
}
public class RunableDemo {
    public static void main(String[] args) {
        int n=8;
        for (int i = 0; i < n; i++) {
            Thread thread=new Thread(new MultiThreadingDemo());
//             thread.setName("Hello "+i);
            thread.start();
        }
    }
}
