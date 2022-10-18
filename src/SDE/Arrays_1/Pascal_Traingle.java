package SDE.Arrays_1;
//https://leetcode.com/problems/pascals-triangle/
import java.util.ArrayList;
import java.util.List;

public class Pascal_Traingle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                // 1st and last are 1
                if (j == 0 || j == i) row.add(1);
//                arr[i][j] = arr[i-1][j] + arr[j-1][j];
                else {
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(row);
        }
        return res;
    }
}
