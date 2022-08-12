package Graph;

import java.util.ArrayList;

public class DFS_Graph {

    private static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {

        // mark the current node as true
        vis[node] = true;
        // add it to ans
        ans.add(node);

        //getting neighbors node
        for (Integer it : adj.get(node)) {
            if (vis[it] == false) {
                dfs(it, vis, adj, ans);
            }
        }
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // TC - O(N) + O(2E)
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V];
        vis[0] = true;
        dfs(0, vis, adj, ans);
        return ans;
    }
}
