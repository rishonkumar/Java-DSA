package Binary_Search;

public class First_Last_Pos {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        ans[0] = firstPost(nums,target);
        if(ans[0] == -1) return  ans;
        ans[1] = lastPost(nums,target);
        return ans;
    }
    int firstPost(int[] arr,int t) {
        int s = 0, e = arr.length-1;
        int ans = -1;
        while(s <= e) {
            int m = s + (e-s)/2;

            if(arr[m] == t) {
                ans = m;
                e = m-1;
            }
            else if(arr[m] < t) s = m+1;

            else e = m-1;
        }
        return ans;
    }

    int lastPost(int arr[], int t) {
        int s = 0, e = arr.length-1;
        int ans = -1;
        while(s <= e) {
            int m = s + (e-s)/2;

            if(arr[m] == t) {
                ans = m;
                s = m+1;
            }
            else if(arr[m] < t) s = m+1;
            else e = m-1;
        }
        return ans;
    }

}
