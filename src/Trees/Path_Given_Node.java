package Trees;

import java.util.ArrayList;

public class Path_Given_Node {

    boolean getPath(TreeNode root, int B, ArrayList<Integer>ans) {
        if(root == null) return false;

        ans.add(root.val);

        if(root.val == B) return true;

        if(getPath(root.left, B, ans) || getPath(root.right, B, ans))
            return true;

        ans.remove(ans.size()-1);

        return false;
    }

    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer>ans = new ArrayList<>();
        if(A == null) return ans;
        getPath(A,B,ans);
        return ans;
    }
}
