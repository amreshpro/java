package oops;

class Calculator {
    int num;

    int add(int n1, int n2) {

        return n1 + n2;
    }

}

public class OOPS {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int res = cal.add(4, 12);
        System.out.println(res);

    }

}
