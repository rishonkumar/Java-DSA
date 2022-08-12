package Binary_Search;

public class Peak_Index {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length-1;

        while(start < end) {
            int mid = start + (end-start)/2;;

            if(arr[mid] > arr[mid+1]) {
                // you are in dec part of the array
                // this may be the ans , but look at left
                // this is why end != mid-1
                end = mid;
            } else {
                // ypu are in asc part of the array
                start = mid+1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        return start;
    }
}
