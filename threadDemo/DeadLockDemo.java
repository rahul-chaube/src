package threadDemo;

public class DeadLockDemo    {
    public static void main(String[] args) {
        try {

            System.out.println("Enter in to Dead Lock ");
            Thread.currentThread().join();
            System.out.println("This statement is never execute ");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
