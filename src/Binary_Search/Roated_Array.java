package Binary_Search;

public class Roated_Array {
    int search(int[] nums, int target) {

        return binarySearch(nums, target, 0 , nums.length-1);
    }


    int binarySearch(int[] arr, int target, int left, int right) {
        if(left > right) return -1;

        int middle = left + (right-left)/2;

        int potientalMatch = arr[middle];

        int rightNum = arr[right] , leftNum = arr[left];

        if(potientalMatch == target) return middle;


        else if(leftNum <= potientalMatch) {

            if(target < potientalMatch && target >= leftNum) {
                //move left
                return binarySearch(arr, target, left, middle-1);
            } else {
                return binarySearch(arr, target, middle + 1, right);
            }
        }
        //let side is not sorted
        else {
            if(target > potientalMatch && target <= rightNum) {
                 return binarySearch(arr, target, middle + 1, right);
            } else {
                return binarySearch(arr, target, left, middle-1);
            }
        }
    }
}
