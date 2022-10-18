package Recursion;

public class Recursion_Final {

    static void printEvenOdd(int a, int b) {

        if (a > b) return;

        if (a % 2 == 0) System.out.println(a);
        printEvenOdd(a + 1, b);
        if (a % 2 != 0) System.out.println(a);
    }

    // TC - O(n)
    static int power_basic(int a, int b) {

        if (b == 0) return 1;

        int smallAns = power_basic(a, b - 1);
        return smallAns * a;
    }

    // optimized approach
    static int power(int a, int b) {

        if (b == 0) return 1;

        int smallAns = power_basic(a, b / 2);
        //even
        if (b % 2 == 0) return smallAns * smallAns;
        //odd
        else return smallAns * smallAns * a;
    }

    public static void main(String[] args) {

        //printEvenOdd(1, 10);
        System.out.println(power(3, 3));
    }
}
