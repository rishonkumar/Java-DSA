package Recursion;

import java.util.Scanner;

public class Sum_OF_N {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(sum(n));
    }

    private static int sum(int n) {

        if(n == 1) return 1;
        int partialAns = sum(n-1);

        return n + partialAns;
    }
}
