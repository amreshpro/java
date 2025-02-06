package  src.foundation150problems.level1;

import java.util.Scanner;public  class problem1{

static public  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int isOdd = n & 1;
        if(isOdd == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }

    }

}