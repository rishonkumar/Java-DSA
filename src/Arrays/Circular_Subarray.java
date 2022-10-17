package Arrays;

public class Circular_Subarray {

    public int maxSubarraySumCircular(int[] nums) {

        int n = nums.length;

        int maxSum = nums[0];
        int currSum = 0;
        for(int i = 0 ; i < ((i+1)%n) ; i++) {
            currSum += nums[i];
            maxSum = Math.max(currSum,maxSum);
            if(currSum < 0) currSum = 0;
        }
        return maxSum;
    }
}
