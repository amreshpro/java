package src.problems;

import java.util.Scanner;

public class ReverseNatural {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
       num = sc.nextInt();
        for (int i = num; i >=1 ; i--) {
            System.out.print(i+", ");
        }
    }
}
