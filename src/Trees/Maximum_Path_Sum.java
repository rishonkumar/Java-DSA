package Trees;

public class Maximum_Path_Sum {
    public int maxPathSum(TreeNode root) {
        int[] maxValue = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPath(root,maxValue);
        return maxValue[0];
    }

    private int maxPath(TreeNode node, int[] maxValue) {
        if(node == null) return 0;
        //if current path have -ve then return 0
        int left = Math.max(0,maxPath(node.left,maxValue));
        int right = Math.max(0, maxPath(node.right,maxValue));

        maxValue[0] = Math.max(left+right+node.val,maxValue[0]);
        //decide which path to choose
        return Math.max(left,right)+node.val;
    }
}