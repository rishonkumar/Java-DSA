package Trees;

import java.util.ArrayList;
import java.util.List;

public class Right_View_BT {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        rightView(root,ans,0);
        return ans;
    }

    public void rightView(TreeNode node, List<Integer>ans, int currLevel) {

        if(node == null) return;

        if(currLevel == ans.size()) ans.add(node.val);

        rightView(node.right, ans, currLevel+1);
        rightView(node.left, ans, currLevel+1);
    }
}
