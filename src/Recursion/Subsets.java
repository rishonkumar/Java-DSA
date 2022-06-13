package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    //TC - O(2^n)

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>currentSet = new ArrayList<>();
        generateSubset(nums,0,currentSet,ans);
        return ans;
    }

    private void generateSubset(int[] nums, int i, List<Integer> currentSet, List<List<Integer>> ans) {

        if(i == nums.length) {
            ans.add(new ArrayList<>(currentSet));
            return;
        }

        //pick up
        int currentElement = nums[i];
        currentSet.add(currentElement);
        generateSubset(nums, i+1, currentSet, ans);

        // not pick
        //for that remove the element added
        currentSet.remove(currentSet.size()-1);
        generateSubset(nums, i+1, currentSet, ans);
        
        return;
    }

}
