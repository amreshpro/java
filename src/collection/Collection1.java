package src.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(15);
        num.add(25);
        num.add(35);
        num.add(45);

        for (Integer x : num) {
            System.out.println(x);
        }

    };
}
