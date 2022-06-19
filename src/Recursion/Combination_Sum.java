package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
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
                recursion(candidates, target - currentElement, currentIndex, ds, ans);
                ds.remove(ds.size() - 1);
            }
            //not pick up
            recursion(candidates, target, currentIndex + 1, ds, ans);

    }
}
