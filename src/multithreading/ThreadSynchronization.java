package src.multithreading;

class Counter{
    int count = 0;
 synchronized void increment(){
        ++count;
    }

}


public class ThreadSynchronization   {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

//        without synchronized - increment() method without synchronized keyword
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
               counter.increment();
            }

        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }

        });

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        System.out.println("Final Count: "+ counter.count); // without synchronization -  anything , inconsisitent , upredictable
        System.out.println("Final Count: "+ counter.count); // 2000 Always

    }
}
