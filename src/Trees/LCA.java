package Trees;

public class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        //Base case
        if(root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //result
        if(left == null) return right;

        else if(right == null) return left;

        //both left and right are not null we found our result
        else 
            return root;
    }
}
