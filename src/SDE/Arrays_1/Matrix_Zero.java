package SDE.Arrays_1;

import java.util.Arrays;

public class Matrix_Zero {

    /*
      Approach 1 :
        Create a dummy array traverse the array if it is "0"
        Then make whole row and col of dummy array 0
        Traverse the array if dummy[i][j] == 0 then mark same of orignal one

        //TC - O(N*M + N*M)
        //SC - O(N)
     */

    public void setZeroesBF(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] d1 = new int[n];
        int[] d2 = new int[m];
        Arrays.fill(d1,-1);
        Arrays.fill(d2,-1);

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j< m ; j++) {
                if(matrix[i][j] == 0) {
                    // mark d1 and d2 == 0
                    d1[i] = 0;
                    d2[j] = 0;
                }
            }
        }

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                if(d1[i] == 0 || d2[j] == 0) matrix[i][j] = 0;
            }
        }
    }

    // OPTIMISED APPROACH TC - (n*m)
    // SC - O(1)
    public void setZeroes(int[][] matrix) {

        int col0 = 1, row = matrix.length , col = matrix[0].length;

        for(int i = 0 ; i < row ; i++) {
            // if any of the first col is 0 then mark col0 = 0
            if(matrix[i][0] == 0) col0 = 0;
            // start from 1st col
            for(int j = 1 ; j < col ; j++) {
                //if any of the row and col is 0 then mark corresponding
                // 0th row and col as 0
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        // start from back and if 0th row and col is 0 then mark [i,j] as 0
        // check col0 = 0 then mark col[0] = 0
        for(int i = row - 1 ; i >= 0 ; i--) {
            for(int j = col - 1 ; j >= 1 ; j--) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
            if(col0 == 0) matrix[i][0] = 0;
        }

    }
}
