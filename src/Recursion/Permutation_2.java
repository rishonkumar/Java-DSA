package Recursion;

import java.util.*;

public class Permutation_2 {

    public List<List<Integer>> permuteUnique(int[] nums) {

        Set<List<Integer>>res = new HashSet<>();
        permutations2(0,nums,res);
        return new ArrayList(res);
    }

    private static void permutations2(int index, int[] nums, Set<List<Integer>>res){

        if(index == nums.length) {
            List<Integer>ds = new ArrayList<>();
            for(int i=0; i<nums.length; i++) {
                ds.add(nums[i]);
            }
            res.add(new ArrayList<>(ds));
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=index; i<nums.length; i++){
            swap(i,index,nums);
            permutations2(index+1,nums,res);
            swap(i,index,nums);
        }

    }

    private static void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
