package Recursion;

import java.util.Scanner;

public class Factorial {

    static int factorial(int n) {

        //Base case
        if(n == 0) return 1;

        int partialAns = factorial(n-1);

        return n*partialAns;
    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n < 0) System.out.println("Error");

        else System.out.println(factorial(n));
    }

}
