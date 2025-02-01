package src.problems;

import java.util.Scanner;

public class SumOfSquareOfFirstNNaturalNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum  = sum + (i*i);
        }
        System.out.println("Sum: " + sum);
    }
}
