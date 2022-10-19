package Algo_Expert;

import java.util.Arrays;

public class Sum_Non_adjacent {
    

    // Recursion approach
    static int solve(int[] arr, int idx) {

        if(idx < 0) return 0;

        if(idx == 0) return arr[0];

        // include and exclude 
        // include mean arr[i] + jump (idx + 2)
        // exclude jump(idx + 1)

        int incl = solve(arr, idx - 2) + arr[idx];
        int excl = solve(arr, idx - 1);

        return Math.max(incl,excl);
    }

    // Memoization
    static int solveMemo(int[] arr, int idx, int[] dp) {

        if(idx < 0) return 0;

        if(idx == 0) return arr[0];

        if(dp[idx] != -1) return dp[idx];

        int incl = solveMemo(arr, idx - 2,dp) + arr[idx];
        int excl = solveMemo(arr, idx - 1,dp);

        dp[idx] =  Math.max(incl,excl);

        return dp[idx];

    }

    static int maxSubsetSumNoAdjacent(int[] arr) {

        // int ans = solve(arr,arr.length - 1);
        // return ans;

        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return solveMemo(arr,arr.length - 1,dp);
    }
}
