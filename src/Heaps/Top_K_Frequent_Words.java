package Heaps;

import java.util.*;
//https://leetcode.com/problems/top-k-frequent-words/
public class Top_K_Frequent_Words {

    public static List<String> topKFrequent(String[] words, int k) {

        // add in map
        Map<String,Integer> map = new HashMap<>();
        for(String s : words) {
            map.put(s,map.getOrDefault(s,0) + 1);
        }
        System.out.println(map);
        //custom comparator for comparing the words
        // if both value are equal then compare by weight
        Queue<String>q = new PriorityQueue<>((w1,w2) ->
                    map.get(w1).equals(map.get(w2)) ? w2.compareTo(w1) : map.get(w1) - map.get(w2));

        // add to heap
        for(String word : map.keySet()) {
            q.add(word);
            if(q.size() > k) q.poll();
        }
        System.out.println(q);
        // add to the result
        List<String>res = new ArrayList<>();
        while (!q.isEmpty()) {
            res.add(q.poll());
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(topKFrequent(words,k));


    }

}
