package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    //  TC - O(n) SC - O(n) + O(n)
    static int memoDp(int n, int[]dp) {

        if(n <= 1) return n;

        //check values are pre-calculated
        if(dp[n] != -1) return dp[n];
        //else store the value in dp
        return dp[n] = memoDp(n-1,dp) + memoDp(n-2,dp);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(memoDp(n,dp));

        // Tabulation TC - O(n) SC - O(n)
        int[] dp1 = new int[n+1];
        dp1[0] = 0;
        dp1[1] = 1;
        for(int i = 2 ; i <= n ; i++) {
            dp1[i] = dp1[i-1] + dp1[i-2];
        }
        System.out.println(dp1[n]);

        // Tabulation - optimised TC - O(n) SC = O(1)
        int prev2 = 0 , prev1 = 1;
        for(int i = 2 ; i <= n ; i++) {
            int curr = prev2 + prev1;
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
    }


}
