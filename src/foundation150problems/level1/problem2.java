package src.foundation150problems.level1;

import java.util.Scanner;


public  class problem2 {

public static  String isPrimeBruteForce(int n){
String result;
//  only even prime number
if(n == 2) return result="Prime";

if(n % 2 == 0) return  result ="Non Prime";

for(int i = 3; i < n ; i+=22) {

  if(n % i  == 0 ) {
      return  result = "Non Prime";
  }

}


return  result="Prime";

}


    public static void main(String[] args){
    System.out.print("Enter number: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(isPrimeBruteForce(n));

    }
}