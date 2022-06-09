package Recursion;

public class Power_Number {

    public static long Pow(int X, int N) {
        //Write your code here
        if(N == 0) return 1;

        long smallAns = X * Pow(X,N-1);

        return smallAns;
    }

//    Better approach - log(n)

    public static long Pow1(int x, int n) {
        if(n == 0) return 1;

        long temp = Pow1(x,n/2);

        if(n % 2 == 1) return temp*temp*x;

        return temp*temp;
    }

    public static void main(String[] args) {

        System.out.println(Pow(9,3));
        System.out.println(Pow1(5,2));

    }
}
