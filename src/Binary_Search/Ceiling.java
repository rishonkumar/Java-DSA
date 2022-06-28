package Binary_Search;

public class Ceiling {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,19};
        int t = 15;
        int ans = ceiling(arr,t);
        System.out.println(ans);
    }

    static int ceiling(int[] arr , int target) {

        //but what if the target is greater than the greater number in the array
        if(target > arr[arr.length-1]) return -1;

        int s = 0;
        int e = arr.length;

        while(s <= e) {
            int m = s + (e-s)/2;

            if(target < arr[m]) e = m-1;

            else if(target > arr[m]) s = m+1;

            else return m;
        }
        //if it doesnt lie n b/w s and e that means ans s
        return s;
    }
}
