package src.famous_interface;

import java.util.function.Consumer;

// consume input , no output
public class ConsumerPro {
public static Consumer<Integer> isLucky = num -> System.out.println("Num : "+num);
    public static void main(String[] args) {
isLucky.accept(67);
    }
}
