package src.collection;

import java.util.Vector;

public class Vector1 {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(6);
        v.add(16);
        v.add(62);
        v.add(69);
        v.add(86);
        v.add(76);

        for (Integer x : v) {
            System.out.println(x);
        }

    }

}
