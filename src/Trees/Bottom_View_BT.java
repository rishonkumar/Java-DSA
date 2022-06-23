package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
// https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
class Pair {
    int hd;
    Node node;

    public Pair(int _hd, Node _node) {
        hd = _hd;
        node = _node;
    }
}

public class Bottom_View_BT {
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer>ans = new ArrayList<>();
        if(root == null) return ans;

        Map<Integer,Integer>map = new TreeMap<>();
        Queue<Pair>q = new LinkedList<Pair>();
        //add root in the queue
        q.add(new Pair(0,root));
        while(!q.isEmpty()) {
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;

            map.put(hd, temp.data);
            //go left and right
            if(temp.left != null) q.add(new Pair(hd-1, temp.left));
            if(temp.right != null) q.add(new Pair(hd+1, temp.right));
            
        }
        //traverse the map
        for(Map.Entry<Integer,Integer>en : map.entrySet()) {
            ans.add(en.getValue());
        }
        return ans;
    }
}
