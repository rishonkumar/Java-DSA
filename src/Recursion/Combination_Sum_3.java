package Recursion;

import java.util.*;

public class Combination_Sum_3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer>ds = new ArrayList<>();
        List<List<Integer>>ans = new ArrayList<>();
        helper(1,k,n,ds,ans);
        return ans;
    }

    private void helper(int start, int k, int n, List<Integer> ds, List<List<Integer>> ans) {

        if(ds.size() == k && n == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = start ; i <=9 ; i++) {
            ds.add(i);
            System.out.println(i);
            helper(i+1,k,n-i,ds,ans);
            ds.remove(ds.size()-1);
        }
    }

    private void helper1(int i, int k, int sumTillNow, int n, List<Integer> ds, List<List<Integer>> ans) {

        if(sumTillNow > n) return;

        if(k == 0) {
            if(sumTillNow == n) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // if i is 10 return (1-9)
        if(i == 10) return;

        // pick up the ith Element
        sumTillNow += i;
        ds.add(i);
        helper1(i+1,k-1,sumTillNow,n,ds,ans);
        //undo the changes
        sumTillNow -= i;
        ds.remove(ds.size()-1);

        // ignore
        helper1(i+1,k,sumTillNow,n,ds,ans);
    }


}
