package Recursion;


import java.util.*;

public class Subset_2 {

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
        //if the consecutive elements are together
        while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
        generateSubset(nums, i+1, currentSet, ans);

        return;
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>currentSet = new ArrayList<>();
        generateSubset(nums,0,currentSet,ans);
        return ans;

    }
}
