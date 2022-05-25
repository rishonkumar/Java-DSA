package Trees;
import java.util.*;
class Tuple {
    TreeNode node;
    int row;
    int col;

    public Tuple(TreeNode _node, int _row, int _col) {
        node = _node;
        row = _row;
        col = _col;
    }
}

public class Vertical_Level_Order {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        //(node,Vertical,level)
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>>map = new TreeMap<>();
        Queue<Tuple>q = new LinkedList<>();

        //push the root
        q.offer(new Tuple(root, 0, 0));
        while(!q.isEmpty()) {
            Tuple t = q.poll();
            TreeNode node = t.node;
            // x - vertical , y - level
            int x = t.row;
            int y = t.col;

            if(!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }
            //get the vertices and level and add the value in priority queue
            map.get(x).get(y).offer(node.val);

            if(node.left != null) q.offer(new Tuple(node.left, x-1, y+1));

            if(node.right != null) q.offer(new Tuple(node.right, x+1, y+1));
        }

        List<List<Integer>>list = new ArrayList<>();
        //traverse every vertical
        for(TreeMap<Integer, PriorityQueue<Integer>>ys : map.values()) {
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer>nodes: ys.values()) {
                while(!nodes.isEmpty()) {
                    System.out.println(nodes.peek());
                    list.get(list.size()-1).add(nodes.poll());
                }
            }
        }
        return list;
    }
}
