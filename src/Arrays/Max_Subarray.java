package Arrays;

public class Max_Subarray {
    /*
        intuition : if i get a -ve sum anywhere then it will make rest of
                   sum less only so instead of adding it to sum make it 0
     */
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxi = Math.max(sum, maxi);

            if (sum < 0) sum = 0;
        }
        return maxi;
    }

}
