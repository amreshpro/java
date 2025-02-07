package src.foundation150problems.level1;

import java.util.Scanner;public class problem4 {

public  static  boolean isArmstrongNumber(int n){
    int temp = n;
    int cubeSum = 0;
    while (temp > 0){

        int lastDigit = temp % 10;
        cubeSum += (lastDigit*lastDigit*lastDigit);
        temp /= 10;
    }

    return  n == cubeSum;
}

    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number: ");
int n = scanner.nextInt();

System.out.println(isArmstrongNumber(n));
    }


}