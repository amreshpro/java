package src.neetcode.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ValidAnagram {
    public static boolean isValidAnagram(String str1,String str2){
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        Arrays.sort(str1Arr,0,str1Arr.length);
        Arrays.sort(str2Arr,0,str2Arr.length);

        return Arrays.equals(str1Arr,str2Arr);
    }
    public static boolean isValidAnagram2(String str1,String str2){
        if(str1.length() == str2.length()) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
            for (int i = 0; i < str1.length(); i++) {
                map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
            }
            for (int j = 0; j < str1.length(); j++) {
                map2.put(str2.charAt(j), map2.getOrDefault(str2.charAt(j), 0) + 1);
            }

            return map1.equals(map2);
        }
        else{
            return  false;
        }
    }

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(isValidAnagram(str1,str2));
        System.out.println(isValidAnagram2(str1,str2));

    }
}
