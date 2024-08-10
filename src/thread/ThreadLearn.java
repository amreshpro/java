package src.thread;

class A extends Thread{
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println("Hello");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println("Bye");
        }
    }
}

public class ThreadLearn {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
 
}
