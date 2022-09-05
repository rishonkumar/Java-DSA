package CTCI.Arrays_String;

import java.util.HashSet;

/*
Given a string, determine if a permutation of the string could form a palindrome.

For example, "code" -> False, "aab" -> True, "carerac" -> True.
 */
public class Plaindrome_Permutation {

    /*
    Intuition :
        If each character occurs even time then its for sure palindrome
        What if its odd
            Then number of odd count character should be one

            Use HashSet add each character if it already contains then remove
            If size of set is <= 1 then it is palindrome
            0 means all where even time and 1 for single character
     */
    static boolean isPalindromePermutation(String s) {

        HashSet<Character>set = new HashSet<>();

        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                set.remove(c);
            }
            else {
                set.add(c);
            }
        }
        return set.size() <= 1;
    }

    public static void main(String[] args) {

        String s = "tactcoa";
        System.out.println(isPalindromePermutation(s));
    }
}
