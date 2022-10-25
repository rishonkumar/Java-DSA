import java.util.HashSet;
import java.util.Set;

public class Panagram {
    /*
    Algorithm
    Initialize an empty hash set seen.
    Iterate over sentence, and add every letter to seen.
    Once we finish the iteration, check if the size of seen equals 26.
     */
    public boolean checkIfPangram(String sentence) {
    
        Set<Character>set = new HashSet<>();
        for(char currentChar : sentence.toCharArray()) {
            set.add(currentChar);
        }
        return set.size() == 26;
        
    }

    boolean checkIfPangram1(String s) {
        int[] freq = new int[26];

        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for(int ele : freq) {
            if(ele == 0) return false;
        }
        return true;
    }
}
