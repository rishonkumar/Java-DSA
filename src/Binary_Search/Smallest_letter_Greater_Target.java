package Binary_Search;

public class Smallest_letter_Greater_Target {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0, e = letters.length - 1;

        while(s <= e) {
            int m = s + (e-s)/2;

            if(target < letters[m]) e = m-1;

            else s = m+1;
        }
        return letters[s%letters.length];
    }
}
