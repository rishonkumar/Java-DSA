package SDE.Arrays_1;

public class Next_Permutation {
    /*
    Algo :
     traverse from back n - 2
     find first idx (break point) a[i] >= a[i+1] => i1

     travese from n-1 find the number from right exactly smallest greater element than i1 element and swap

     reverse (i1+1,last)

    edge case if no break point then just reverse
*/
    public void nextPermutation(int[] A) {

        int n = A.length;

        if (A == null || n == 0) return;

        int i = n - 2;
        while (i >= 0 && A[i] >= A[i + 1]) i--;

        //found the break point
        if (i >= 0) {
            int j = n - 1;
            while (A[i] >= A[j]) j--;
            swap(A, i, j);
        }
        reverse(A, i + 1, n - 1);
    }

    void swap(int[] A, int i, int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }

    void reverse(int[] A, int i, int j) {
        while (i < j) {
            swap(A, i++, j--);
        }
    }
}
