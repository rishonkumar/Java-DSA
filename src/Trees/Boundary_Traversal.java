package Trees;

import java.util.ArrayList;

public class Boundary_Traversal {

    Boolean isLeaf(Node node) {
        return (node.left == null) && (node.right == null);
    }

    private void addRightBoundary(Node node, ArrayList<Integer> ans) {
        Node curr = node.right;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while (curr != null) {
            if (isLeaf(curr) == false) temp.add(curr.data);
            //go right first if doesn't exist then go left
            if (curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        //now reverse
        int i;
        for (i = temp.size() - 1; i >= 0; i--) {
            ans.add(temp.get(i));
        }
    }


    private void addLeaves(Node node, ArrayList<Integer> ans) {
        //inorder traversal
        if (isLeaf(node)) {
            ans.add(node.data);
            return;
        }
        if (node.left != null) addLeaves(node.left, ans);
        if (node.right != null) addLeaves(node.right, ans);
    }


    private void addLeftBoundary(Node node, ArrayList<Integer> ans) {
        Node curr = node.left;
        //if node is not leaf add it to ans
        //if left doesn't exits go to right
        while (curr != null) {
            if (isLeaf(curr) == false) ans.add(curr.data);
            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    public ArrayList<Integer> traverseBoundary(Node root) {

        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (isLeaf(root) == false) ans.add(root.data);
        //left boundary
        addLeftBoundary(root, ans);
        addLeaves(root, ans);
        addRightBoundary(root, ans);

        return ans;
    }
}
