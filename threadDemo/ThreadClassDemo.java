package threadDemo;

class MultithreadingDemo extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getName()+" is running ");
    }
}

 class ThreadClassDemo {
     public static void main(String[] args) {
         int n=8;
         for (int i = 0; i < n; i++) {
            MultithreadingDemo multithreadingDemo=new MultithreadingDemo();
            multithreadingDemo.setName("Hello"+i);
            multithreadingDemo.start();

         }
     }
}
