import java.util.*; // O(n+m)

public class BFSAdjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); // size of graph
        int m = sc.nextInt(); // no of edges
        ArrayList<ArrayList<Integer>> G = new ArrayList<>(); // adj list

        // creating n number of vertices in graph
        for (int i = 0; i <= n; i++) {
            G.add(new ArrayList<Integer>());
        }
        //reading edges of graph
        for (int i = 1; i <= m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            G.get(u).add(v);
            G.get(v).add(u);
            //making un-directed graph
        }
        Queue<Integer> q = new LinkedList<>(); // declaring a queue
        q.add(1); //push source node = 1 in the queue

        int[] vis = new int[n + 5]; //vis[i] = 0 means node has visited
        vis[1] = 1; //visited 

        int[] lvl = new int[n + 5]; //know level of each node
        lvl[1] = 0; //lvl of ource node, is 0 

        while (!q.isEmpty()) {
            // BFS Algo

            int v = q.remove(); //top most element of queue

            System.out.println(v + " " + lvl[v]); //print node with its level

            for (int i = 0; i < G.get(v).size(); i++) {
                // iterating through all nodes connected to node v
                int u = G.get(v).get(i);
                if (vis[u] == 0) {
                    // if the node u (node connected to v) has never been visited before then let's visit it
                    q.add(u);
                    vis[u] = 1; //visited hence setting its value as 1
                    lvl[u] = lvl[v] + 1; // lvl[u] will be 1 greater than lvl[1] as we move 1 step forward from u to v
                }
            }
        }
    }
}

/** BFS Algorithms - Level wise traversal, use Queue to implement
Queue - from right add element(rear) and from left remove(front)
Application- Able to calculate shortest path to other node as visiting levelwise
Adj list - O(n+m) (list of list), Matrix (O(n*n)
**/
