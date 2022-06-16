package Recursion;

public class Palindrome {

    private static  Boolean helper(String s, int l, int r) {
        if(l > r) return true;

        if(s.charAt(l) != s.charAt(r)) return false;

        return helper(s,l+1,r-1);
    }

    public static Boolean isPalindrome(String s) {
        return helper(s,0,s.length()-1);
    }
}
