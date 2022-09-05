package CTCI.Arrays_String;
//https://practice.geeksforgeeks.org/problems/anagram-1587115620/1
import java.util.*;


/*
Given two strings, write a method to decide if one is a permutation of the
other.
 A Permutation of a string is another string that contains same characters,
 only the order of characters can be different.
  For example, “abcd” and “dabc” are Permutation of each other.
 */
public class Check_Permutation {

    /*
    Method 1 : Sort and compare
                TC - NlogN
     */
    static String sort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    static boolean permutation(String word1, String word2) {
        String s1 = sort(word1);
        String s2 = sort(word2);
        return s1.equals(s2);
    }

    /*
    Method 2

         Intuition : increment value of letter for traversing string a
                    decrement value of letter while traversing string b
                    if both strings are same then whole array will be 0
                    else at any index its negative then return false
     */

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;

        int[] letters = new int[128];

        for (int i = 0; i < a.length(); i++) {
            letters[a.charAt(i)]++;
        }

        for (int i = 0; i < b.length(); i++) {
            letters[b.charAt(i)]--;
            if (letters[b.charAt(i)] < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            boolean anagram1 = isAnagram(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram + " , " + anagram1);
        }
    }

}
