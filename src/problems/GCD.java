package src.problems;

public class GCD {

//    brute force approach
    static int gcd(int a,int b){
        if(a  == 0 ) return  b;
        if (b == 0) return  a;

        int hcf = 1;
        int min = Math.min(a,b);
       for(int i = 1; i <= min; i++) {
       if(a % i == 0 && b % i == 0 ){
           hcf = i;
       }
     }

     return  hcf;


    }


    public static void main(String[] args){

        int a = 48,b = 18;
        System.out.println("gcd: "+gcd(a,b));
    }
}
