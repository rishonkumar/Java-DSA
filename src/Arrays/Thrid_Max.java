package Arrays;

public class Thrid_Max {
    public static int thirdMax(int[] A) {
        int n = A.length;
        int maxi = Integer.MIN_VALUE;
        if(n <= 2) {
            if(A[0] > maxi) maxi = A[0];

            if(A[1] > A[0]) maxi = A[1];

            return maxi;
        }
        int firstMax = A[0], secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;

        for(int i=1; i<n; i++) {
            if(A[i]>firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = A[i];
            }
            else if(A[i]>=secondMax) {
                thirdMax = secondMax;
                secondMax = A[i];
            }
            else if(A[i]>=thirdMax) {
                thirdMax = A[i];
            }
        }
        return thirdMax;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,3,1};
        // int n = arr.length;
        System.out.println(thirdMax(arr));

    }
}
