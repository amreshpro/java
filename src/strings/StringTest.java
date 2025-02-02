package src.strings;

public class StringTest {

    public static void main(String[] args){
      String name = "Amresh"; // string literal
      String name2 = "Amresh";
      String name0 = name;
      // name and name2 have same reference in string pool
      String name3 = new String("Amresh"); // string constructor , always have different  unique refrence
      String name4 = new String("Amresh"); // string constructor , always have different  unique refrence

      System.out.println(name);
      System.out.println(name2);
      System.out.println(name3);
      System.out.println(name0 == name2);
      System.out.println(name == name2);
      System.out.println(name == name3); // check reference
      System.out.println(name.equals(name3));  // check value
      System.out.println(name3 == name4);

      name = "Amresh Maurya";
      System.out.println(name);

    }
}
