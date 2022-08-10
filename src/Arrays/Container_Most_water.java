package Arrays;

public class Container_Most_water {
    /*
        Using 2 pointer approach
        Move i and j depending on which is smaller
        Width => j - i
     */
    public int maxArea(int[] a) {

        int maxArea = 0;
        int i = 0, j = a.length - 1;

        while (i < j) {
            int height = Math.min(a[i], a[j]);
            int width = j - i;

            int area = width * height;
            maxArea = Math.max(area, maxArea);
            if (a[i] < a[j]) i++;
            else j--;
        }
        return maxArea;
    }
}
