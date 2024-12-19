package collections;


import java.util.HashMap;

public class HashSetDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 1, 4, 6, 4, 8};
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : arr) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        for (int i : arr)
            System.out.print(hashMap.get(i) + " ");

    }


}
