package CTCI.Arrays_String;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
 */
public class isUnique {

    /*
    Approach 1 :
        Convert string to character array for sorting
        TC - O(nlogn)
     */
    static boolean isUniqueChars1(String str) {

        char[] chArray = str.toCharArray();

        Arrays.sort(chArray);
        for (int i = 0; i < chArray.length - 1; i++) {

            if (chArray[i] != chArray[i + 1]) {
                continue;
            } else return false;
        }

        return true;
    }

    /*
    Approach 2  : Using extra space
                  TC O(n) SC : O(n)
     */

    static boolean isUnique(String str) {

        if(str.length() > 128) return false;
        boolean[] check = new boolean[128];

        for(int i = 0 ; i < str.length() ; i++) {
            int val = str.charAt(i);
            // if it already contains then return false
            // if not make the index true
            if(check[val]) return false;
            check[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "abdcd";
        System.out.println(isUniqueChars1(word));
        System.out.println(isUnique(word));
//        for (String word : words) {
//            System.out.println(word + ": " + isUniqueChars(word));
//        }
    }
}
