package threadDemo;

import com.google.api.client.util.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                if (i==0){
                    Date d=new Date();
                    DateTime time=new DateTime(d);
                    SimpleDateFormat format=new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for task name "+name + " = "+d.getTime()+" : "+time.toString());

                }
                else{
                    Date d=new Date();
                    SimpleDateFormat format=new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name "+name + " = "+format.format(d));

                }
                Thread.sleep(1000);
            }
            System.out.println(name +" is completed ");
        }catch (Exception e){
            e.printStackTrace();
    }
}

}
public class ExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
//        Runnable t1=new Task("Task 1");
//        Runnable t2=new Task("Task 2");
//        Runnable t3=new Task("Task 3");
//        Runnable t4=new Task("Task 4");
//        Runnable t5=new Task("Task 5");

        ExecutorService pool= Executors.newFixedThreadPool(50);
        for (int i = 0; i < 1000; i++) {
            Runnable runnable=new Task("Task "+i);
            pool.execute(runnable);
            Thread.sleep(1);

        }
        pool.shutdown();
    }
}
