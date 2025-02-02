package src.filehandling;

import java.io.*;import java.util.Arrays;

class Student extends StringWriter {
    int id;
    String name;
    int age;
    Student(){}
    Student(int id,String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
  void  setStudent(int id,String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return  "[ id: " + this.id + ", name: "+this.name + ", age: "+this.age + " ]" ;
    }

}


public class StudentDetails {


    public static void main(String[] args)throws IOException {

           Student student = new Student(1,"Amresh",24);
                System.out.println(student.toString());

        try{


            File file = new  File("./Student.txt");

        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }



    }

}
