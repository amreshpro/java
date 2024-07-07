package java8;

public class Lamda {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello, World!");
        System.out.println(r);
    }
}
