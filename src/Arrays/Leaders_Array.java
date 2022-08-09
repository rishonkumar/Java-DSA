package Arrays;

import java.util.ArrayList;
// https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
public class Leaders_Array {
    static ArrayList<Integer> leaders(int arr[], int n){

        ArrayList<Integer>temp = new ArrayList<>();
        int currentElement = arr[n-1];
        for(int i = n-1 ; i >= 0 ; i--) {
            if(arr[i] >= currentElement) {
                temp.add(arr[i]);
                currentElement = arr[i];
            }
        }

        ArrayList<Integer>ans = new ArrayList<>();
        int i = temp.size() - 1 ;
        while(i >= 0) {
            ans.add(temp.get(i));
            i--;
        }
        return ans;
    }
}
