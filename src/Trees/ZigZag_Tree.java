package Trees;
import java.util.*;

public class ZigZag_Tree {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();

        if(root == null) return ans;
        Queue<TreeNode>queue = new LinkedList<TreeNode>();
        //push the root
        queue.add(root);
        boolean leftToright = true;

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer>x = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                //if current node has left and right then add it in queue
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                x.add(node.val);
            }
            //System.out.println(x);
            //if left to right is false then reverse the element added
            if(leftToright == false) Collections.reverse(x);

            //System.out.println(x);
            leftToright = !leftToright;
            ans.add(x);
        }
        return ans;
    }
}
