package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        int listStream = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(listStream);

        List<Integer> numbers = Arrays.asList(1, 2,78, 3, 4, 5,6,7,8,9);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product); // Output: Product: 120

        numbers.stream().forEach(i -> System.out.println(i));
        List<Integer> listSquare = numbers.stream().map(a -> a * a).collect(Collectors.toList());
        System.out.println(listSquare);
        List<Integer> evenList = numbers.stream().filter(a -> a % 2 == 0).sorted().collect(Collectors.toList());
        System.out.println(evenList);
    }

}