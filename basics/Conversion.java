public class Conversion {
public static void main(String[] args) {
    byte a =5;
    // byte->int

    int b = a;
    System.out.println(b);
    // 2.
    int c  = 5;
    // byte d = c; // error
    // System.out.println(d);
    //3. solve 2 do explict conversion
    int e = 5;
    byte f = (byte)e;
    System.out.println(f);//value conversion
// 4.
char a1 = 'A';
// char->int
int b2 = a1;
System.out.println(b2);

// 5.
int a21 =65;
// int->char is not possible implicitly
// char b21 = a21;//error
// System.out.println(b21);



// 6. to solve 5 do explicit conversion
int num = 65;
char isA=(char)num;
System.out.println(isA);//A

// 7.
boolean test = true;
// boolean to int   
// int test2 = test; //error this error can't be solved
// int test2 =(int) test; //error boolean to other type can't typecast
// System.out.println(test2);//


// 8.
float f1=34.55f;
// float->int
// int i1=f1; //error
int i1=(int)f1; //valid but loss of  data

System.out.println(i1);//34 -> .55 truncated


}    
}
