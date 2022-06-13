package Recursion;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutations/
public class Permutation {

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
//        permutations(nums,temp,ans);
        permutations2(0,nums,ans);
        return ans;
    }

    private static void permutations(int[] nums, List<Integer> temp, List<List<Integer>> ans) {

        if(temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(temp.contains(nums[i])) continue; // element already exits, skip
            temp.add(nums[i]);
            permutations(nums,temp,ans);
            temp.remove(temp.size()-1);
        }
    }

    private static void permutations2(int index, int[] nums, List<List<Integer>>ans){

        if(index == nums.length) {
            List<Integer>ds = new ArrayList<>();
            for(int i=0; i<nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index; i<nums.length; i++){
            swap(i,index,nums);
            permutations2(index+1,nums,ans);
            swap(i,index,nums);
        }

    }

    private static void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}
