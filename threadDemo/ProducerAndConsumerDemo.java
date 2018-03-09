package threadDemo;

import java.util.LinkedList;

public class ProducerAndConsumerDemo {
    // Create a list shared by producer and consumer
    // size of list is 2
    LinkedList<Integer> list = new LinkedList<>();
    int capacity=2;

    //Function is called by producer
    public void produce() throws InterruptedException {
        int value=0;
        while (true)
        {
            synchronized (this){
                //producer thread will wait while list is full
                while (list.size()==capacity)
                    wait();
                System.out.println("Producer produce "+value);

                //to insert job in list
                list.add(value++);
                //notify the consumer thread that now it can start consuming


            }
        }
    }
}
