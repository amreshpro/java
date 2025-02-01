package src.multithreading;

public class Thread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread: " + i);
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Thread1 Thread1 = new Thread1();
        Thread thread = new Thread(Thread1);
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello Amresh: " + i);
        }
    }
}
