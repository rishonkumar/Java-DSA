package Strings;

public class count_say {
    public String countAndSay(int n) {
      
        //base case
        if(n == 1) return "1";

        // we need previous value 
        String s = countAndSay(n-1);

        int cnt = 0;
        String res = "";
        // first frequency then element

        for(int i = 0 ; i < s.length() ; i++) {
            cnt++;
            if(i == s.length() - 1 || s.charAt(i) != s.charAt(i+1)) {
                res = res + cnt + s.charAt(i);
                //reset cnt
                cnt = 0;
            }
        }
        return res;
    }
}

