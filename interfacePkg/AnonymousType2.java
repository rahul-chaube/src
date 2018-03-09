package interfacePkg;

public class AnonymousType2 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {

                System.out.println("Child Class ");
                try {
                    Thread.sleep(5000);
                    System.out.println("I am Wake up ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("Main Thread");
    }
}
