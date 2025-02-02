package src.oops;

class Complex{
    // properties/instance variable
    int real;
    int imaginary;

    Complex(){

    }
    // initialize a properties
    Complex(int real , int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }


    void print(){
        System.out.println("Real: "+this.real+", Imaginary: "+this.imaginary);
        System.out.println(this.real+" + "+this.real+"i");
    }

}





public class ComplexNumber{
    public static void main(String[] args){
      Complex complex = new Complex(4,5);
//      complex.real = 4;
//      complex.imaginary=5;
       complex.print();
    }
}
