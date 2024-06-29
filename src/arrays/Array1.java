package src.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = {12, 23};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        ArrayList<Integer> arr2 = new ArrayList<Integer>(5);
        arr2.add(56);
        arr2.add(40);
        arr2.addLast(67);
        System.out.println(arr2);
        System.out.println(arr2.getFirst());
        System.out.println(arr2.getLast());
        System.out.println(arr2.get(1));
        System.out.println(arr2.size());


    }


}
