package src.neetcode.array;

import java.util.Arrays;

public class AddOne {
public static int[] afterAddOne(int[] nums){



    return nums;
}
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] result = afterAddOne(arr);
        for (int i : result){
            System.out.print(i+", ");
        }
    }
}
