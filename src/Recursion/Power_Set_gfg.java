package Recursion;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class Power_Set_gfg {

    public List<String> AllPossibleStrings(String s)
    {
        List<String>ans = new ArrayList<>();
        helper(s, 0 , "", ans);
        sort(ans);
        return ans;
    }

    public void helper(String s, int idx, String curr, List<String>ans) {

        if(idx == s.length()) {
           ans.add(curr);
            return;
        }

        // pick up
        helper(s, idx+1, curr + s.charAt(idx), ans);
        helper(s, idx, curr, ans);
    }
}
