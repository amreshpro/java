package src.problems;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x2,x,constant;

        System.out.println("Enter coefficient of x2: ");
        x2 = scanner.nextInt();


        System.out.println("Enter coefficient of x: ");
        x = scanner.nextInt();

        System.out.println("Enter constant: ");
        constant = scanner.nextInt();

        int descriminant;

        descriminant = x*x - (4 * x2 * constant);

        if(descriminant > 0){
            System.out.println("Have two roots");
            double root1 =  (- x - Math.sqrt(descriminant))/ (2*x2);
            double root2 =  (- x + Math.sqrt(descriminant))/ (2*x2);
            System.out.println("Root1: " + root1);
            System.out.println("Root2: " + root2);


        } else if (descriminant == 0) {
            System.out.println("have one root");

        }
        else{
            System.out.println("Imaginary Root/Complex Root");
        }


    }
}
