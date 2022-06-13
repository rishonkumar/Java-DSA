package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_Array {

    private static void reverseArray(int l, int r, ArrayList<Integer> arr) {

        if (l > r) return;

       int temp = arr.get(l);
       arr.set(l,arr.get(r));
       arr.set(r,temp);

        reverseArray(l + 1, r - 1, arr);

    }

    public static void reverseArray(ArrayList<Integer> arr, int m) {
        reverseArray(m+1, arr.size() - 1, arr);
    }
}
