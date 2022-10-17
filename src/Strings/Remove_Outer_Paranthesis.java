package Strings;

//https://leetcode.com/problems/remove-outermost-parentheses/
public class Remove_Outer_Paranthesis {

/*
Explanation:
opened count the number of opened parenthesis.
Add every char to the result,
unless the first left parenthesis,
and the last right parenthesis

*/
    public static String removeOuterParentheses(String s) {
        int opened = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                if (opened > 0) sb.append(c);
                opened++;
            }
            if (c == ')') {
                if (opened > 1) sb.append(c);
                opened--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}


// "(()())(())" -> ( ()() ) + ( () ) -> ()()()

// "(()())(()) (()(()))" -> ( ()() ) + ( () ) + ( () ( () ) )
//                       -> ()()()()(())
