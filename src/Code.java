package src;

import java.util.Scanner;

public class Code {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println(n*n*n);
    }
}
