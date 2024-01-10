package FunWJava.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class traversal {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        int v = adj.size();
        ArrayList<Integer> listToAdd = new ArrayList<>();
        Boolean[] vis = new Boolean[v];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()) {

            int node = q.poll();
            listToAdd.add(node);

            for (Integer i : adj.get(node)){
                if (vis[i] == false) {
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
        return listToAdd;
    }
}
