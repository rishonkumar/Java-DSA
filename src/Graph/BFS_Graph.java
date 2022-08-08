package Graph;
//https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bfs_of_graph
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Graph {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        //  TC - O(V+E), where V is the number of nodes and E is the number of edges.
        ArrayList<Integer>bfs = new ArrayList<>();
        Queue<Integer>queue = new LinkedList<>();
        boolean[] vis = new boolean[V];

        // add the starting node
        queue.add(0);
        vis[0] = true;

        while(!queue.isEmpty()) {
            Integer node = queue.poll();
            // add it to bfs
            bfs.add(node);
            // get it adjacents node
            // if not visited mark it visited and add it to queue
            for(Integer it : adj.get(node)) {
                if(vis[it] == false) {
                    vis[it] = true;
                    queue.add(it);
                }
            }
        }
        return bfs;
    }

}
