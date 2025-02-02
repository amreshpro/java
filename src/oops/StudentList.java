package src.oops;


class Student{
    // constructor
//    Student(){
//
//    }

    Student(int bal){
        currentBalance = bal;
    }
    //properties
    private int id;
    private String name;
    private int age;
    private int currentBalance;
    void setStudent(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;

    }

    void print(){
        System.out.println("[ id: "+ id +", name: "+name+", age: "+age+" ]");
    }

    void setCurrentBalance(int balance){
        currentBalance = balance;
    }

    int getCurrentBalance(){
        return  currentBalance;
    }
    void pay(){
        System.out.println("pay me 100");
    }
    void payMe100(){
        currentBalance = currentBalance - 100;
        System.out.println("Payment successfully");
    }
}


public class StudentList {

    public static void main(String[] args){
      Student student1  = new Student(4533); // object / instance
      System.out.println(student1.getCurrentBalance());
      student1.pay();
      student1.payMe100();
      student1.print();
      student1.setStudent(1,"Akash",19);
      student1.print();


    }
}
