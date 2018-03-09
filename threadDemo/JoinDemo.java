package threadDemo;

class ThreadJoing extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Current Thread : "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) {
        ThreadJoing t1=new ThreadJoing();
        ThreadJoing t2=new ThreadJoing();
        ThreadJoing t3=new ThreadJoing();

        // thread 1  is start
        Thread main=Thread.currentThread();
        System.out.println("Main Thread "+main.getName() + " its state "+main.getState());
        System.out.println(" Child thread state "+t1.getState());

        t1.start();
        System.out.println(" Child thread state "+t1.getState());
        try {
            System.out.println("Main Thread "+main.getName() + " its state "+main.getState());

            System.out.println("Current Thread : "+Thread.currentThread().getName());
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" Child thread state "+t1.getState());

        t2.start();
        try {
            System.out.println("Main Thread "+main.getName() + " its state "+main.getState());

            System.out.println("Current Thread : "+Thread.currentThread().getName());
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
        try {
            System.out.println("Main Thread "+main.getName() + " its state "+main.getState());

            System.out.println("Current Thread : "+Thread.currentThread().getName());
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
