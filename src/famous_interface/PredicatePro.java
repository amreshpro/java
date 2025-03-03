package src.famous_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicatePro {

public static Predicate<Integer>  isEven = num->num % 2 == 0 ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isEven.test(num));
    }
}
