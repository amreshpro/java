package src;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int result = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Error: Divide by zero : "+e);


        }
    }
}
