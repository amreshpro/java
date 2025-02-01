package src.multithreading;


public class Thread2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread: "+ i);
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Thread2 Thread2 = new Thread2();
        Thread2.start();
        System.out.println("Main Thread : "+ Thread.currentThread().getName());

        System.out.println("Hello World");
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hey Amresh: "+ i);
        }

    }
}
