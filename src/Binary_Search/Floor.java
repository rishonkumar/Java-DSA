package Binary_Search;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,19};
        int t = 14;
        int ans = floor(arr,t);
        System.out.println(ans);
    }

    static int floor(int[] arr , int target) {

        int s = 0;
        int e = arr.length;

        while(s <= e) {
            int m = s + (e-s)/2;

            if(target < arr[m]) e = m-1;

            else if(target > arr[m]) s = m+1;

            else return m;
        }
        //if it doesn't lie n b/w s and e that means ans e after breaking the loop
        return e;
    }
}
