package threadDemo;

class Table{
    synchronized void printTable(int n){//synchronized method
        System.out.println("======= Thread ===== "+Thread.currentThread().getName());
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

 class TestSynchronization2{
    public static void main(String args[]){
        Table obj = new Table();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);


        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printTable(2000);
            }
        });
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printTable(6000);
            }
        });
        t1.start();
        t2.start();
        thread.start();
        thread1.start();

        try {
            t1.join();
            t2.join();
            thread1.join();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}