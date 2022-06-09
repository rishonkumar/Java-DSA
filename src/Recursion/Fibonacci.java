package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {

//        f(3) = f(2) + f(1)
          if(n == 1) return 1;
          if(n == 2) return 1;
          return fibonacci(n-1) + fibonacci(n-2);
    }
}
