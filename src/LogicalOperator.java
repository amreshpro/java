package src;

/**
 * all logical operators are also return boolean value
* AND(&&),OR(||) operators are binary operators
* Logical NOT (!) operator is unary operator
**/

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("Hello Java");


        // code -1
        int a1 = 7,b1=5,c1=2;
        boolean d1 = (a1>b1) && (a1>c1);
        System.out.println(d1); // true

    }
}
