package CTCI.Arrays_String;
/*
There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false

https://www.geeksforgeeks.org/check-if-two-given-strings-are-at-edit-distance-one/

    Intuition :
        bool diff = false
        if current character is not same
            check if diff is true if yes then return false (meaning we found more than 1 diff)
            mark diff = true
            if both the length is same move smaller index string (i1++)
       else
            move i1++
        i2++;Always move larger index string(i2++)
 */
public class OneAway {

    static boolean oneEditAway(String a, String b) {

        if(Math.abs(a.length() - b.length()) > 1) return false;

        // Getting shorter and longer string
        String s1 = a.length() < b.length() ? a :  b;
        String s2 = a.length() < b.length() ? b : a;
        int i1 = 0 , i2 = 0;
        boolean foundDifference = false;
        while(i2 < s2.length() && i1 < s1.length()) {

            // if both character are not same
            if(s1.charAt(i1) != s2.charAt(i2)) {
                if(foundDifference) return false;
                foundDifference = true;
                // On replace, move shorter pointer
                if(s1.length() == s2.length()) i1++;
            }
            else {
                i1++;
            }
            i2++;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "palee";
        String b = "pale";
        boolean isOneEdit1 = oneEditAway(a, b);
        System.out.println(a + ", " + b + ": " + isOneEdit1);

        String c = "pale";
        String d = "bkle";
        boolean isOneEdit2 = oneEditAway(c, d);
        System.out.println(c + ", " + d + ": " + isOneEdit2);
    }
}
