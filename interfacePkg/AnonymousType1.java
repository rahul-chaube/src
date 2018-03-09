package interfacePkg;

public class AnonymousType1 {
    public static void main(String[] args) {
        Thread thread=new Thread()
        {
            @Override
            public void run() {
                super.run();
                System.out.println( "Child thread is Running ");
            }
        };
        thread.start();
        System.out.println("Main Thread");
    }
}
