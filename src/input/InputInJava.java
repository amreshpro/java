package src.input;

import java.util.Scanner;

public class InputInJava {

    public static void main(String[] args) {

        // scanner, input buuffer
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
//      String n = sc.next();
        System.out.println("Square: "+(n+n));

    }

}
