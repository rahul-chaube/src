package interfacePkg;

public class AnounymousType3 {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Child Thread is Working");
            }
        });
        thread.start();
        System.out.println("Main Thread is Running ");
    }
}
