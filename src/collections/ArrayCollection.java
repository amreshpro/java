package src.collections;

import java.util.ArrayList;

public class ArrayCollection {


    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(5);
        arr.add("Amresh");
        arr.addFirst("Amit");
        arr.addLast("Ojas");
        arr.add("Aryan");
        System.out.println(arr.get(1));
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());

    }
}
