package src.neetcode.array;

public class TwoSum {

    public static int[] twoSum(int[] arr , int target){
        int[] res = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7};
        int target = 10;
        int[] res = twoSum(arr,target);
       for(int i : res){
           System.out.println(i);
       }
    }
}
