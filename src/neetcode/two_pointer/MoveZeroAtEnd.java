package src.neetcode.two_pointer;

public class MoveZeroAtEnd {

public static int[] moveZerosAtEnd(int[] arr ){
   int n = arr.length;
   int k = 0;
    for (int i = 0; i < n; i++) {
        if(arr[i] != 0){
          int temp = arr[k];
          arr[k] = arr[i];
          arr[i] = temp;
          ++k;
        }

    }
    return  arr;
}

public static void main(String[] args) {
int[] arr = { 0,0,0,1,2,3,4,5,6};
int[] result = moveZerosAtEnd(arr);
     for (int i : result){
         System.out.print(i+", ");
     }
    }
}
