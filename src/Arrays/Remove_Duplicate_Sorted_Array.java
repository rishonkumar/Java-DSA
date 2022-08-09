package Arrays;
//https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
/*
    N = 5
    Array = {2, 2, 2, 2, 2}
    Output: 1
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Remove_Duplicate_Sorted_Array {

    int remove_duplicate(int A[], int N) {

        int j = 0;

        for(int i = 0 ; i < N-1 ; i++) {
            if(A[i] != A[i+1]) {
                A[j] = A[i];
                j++;
            }
        }
        // For the last element
        A[j] = A[N-1];
        j++;
        return j;
    }

}
