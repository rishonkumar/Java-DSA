package Trees;

public class Symmetric_Tree {
    
    public boolean isSymmetric(TreeNode root) {
        return (root == null) || isSymmetric(root.left,root.right);   
    }

    private boolean isSymmetric(TreeNode node1, TreeNode node2) {

        if(node1 == null || node2 == null) return node1 == node2;

        if(node1.val != node2.val) return false;

        return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
    }
}
