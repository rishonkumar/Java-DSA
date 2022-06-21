package Recursion;


import java.util.*;

public class Combination_Sum_2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        recursion(candidates, target, 0, ds, ans);
        return ans;
    }
    private void recursion(int[] candidates, int target, int currentIndex, ArrayList<Integer> ds, List<List<Integer>> ans) {

        //Base case
        if (currentIndex == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        int currentElement = candidates[currentIndex];
        //pick up
        if (currentElement <= target) {
                ds.add(currentElement);
            recursion(candidates, target - currentElement, currentIndex+1, ds, ans);
            ds.remove(ds.size() - 1);
        }
        // check if current index and next index element are same then move to next index
        // make sure next index is less than length of array
        //not pick up
        if( currentIndex+1 < candidates.length && candidates[currentIndex] == candidates[currentIndex+1] ) currentIndex++;
        recursion(candidates, target, currentIndex + 1, ds, ans);

    }

}
