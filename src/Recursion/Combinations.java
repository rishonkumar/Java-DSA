package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer>subSet = new ArrayList<>();
        List<List<Integer>>ans = new ArrayList<>();
        helper(1,n,k,subSet,ans);
        return ans;
    }

    private void helper(int i, int n, int k, List<Integer> subSet, List<List<Integer>> ans) {

        if(k == 0) {
            ans.add(new ArrayList<>(subSet));
            return;
        }

        if(i > n) return;

        //take the ith element
        subSet.add(i);
        helper(i+1,n,k-1,subSet,ans);

        // skip the ith element
        subSet.remove(subSet.size()-1);
        helper(i+1,n,k,subSet,ans);
    }
}
