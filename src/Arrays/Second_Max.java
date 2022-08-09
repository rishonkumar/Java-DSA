package Arrays;
//https://practice.geeksforgeeks.org/problems/second-largest3735/1

/*
    {12,35,1,10,34,1}

 */
public class Second_Max {

    int print2largest(int arr[], int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (n < 2) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) return -1;
        return secondLargest;
    }
}
