package src.neetcode.array;

public class MajorityElement {

    public static int bruteForce(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            int count = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ++count;
                }
            }

            if (count > (nums.length / 2)) {
                return nums[i];
            }

        }

        return -1;

    

    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println("Result: "+ MajorityElement.bruteForce(arr));

    }
}
