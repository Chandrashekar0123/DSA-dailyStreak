import java.util.*;

public class ArticulationPoint {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // 🔹 Function to create a sample graph
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Example graph
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
    }

    // 🔹 DFS to find articulation points
    public static void dfs(ArrayList<Edge>[] graph, int curr, int par,
                           boolean[] vis, int[] dt, int[] low, int time,
                           boolean[] isArticulation) {

        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int child = 0; // Count of child nodes in DFS tree

        for (Edge e : graph[curr]) {
            if (e.dest == par) continue; // Skip parent

            if (vis[e.dest]) {
                // Back edge
                low[curr] = Math.min(low[curr], dt[e.dest]);
            } else {
                // DFS for unvisited neighbor
                dfs(graph, e.dest, curr, vis, dt, low, time, isArticulation);
                low[curr] = Math.min(low[curr], low[e.dest]);

                // Articulation condition for non-root nodes
                if (dt[curr] <= low[e.dest] && par != -1) {
                    isArticulation[curr] = true;
                }
                child++;
            }
        }

        // Articulation condition for root node
        if (par == -1 && child > 1) {
            isArticulation[curr] = true;
        }
    }

    // 🔹 Function to get all articulation points
    public static void getArticulation(ArrayList<Edge>[] graph, int V) {
        int[] dt = new int[V];
        int[] low = new int[V];
        int time = 0;
        boolean[] vis = new boolean[V];
        boolean[] isArticulation = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, vis, dt, low, time, isArticulation);
            }
        }

        System.out.println("Articulation Points:");
        for (int i = 0; i < V; i++) {
            if (isArticulation[i]) {
                System.out.println(i);
            }
        }
    }

    /*
    1️⃣ Initialize arrays:
   - vis[] → tracks visited nodes
   - dt[] → discovery time
   - low[] → lowest reachable ancestor
   - isArticulation[] → marks articulation points

2️⃣ Perform DFS traversal:
   - Set `dt[curr] = low[curr] = ++time`
   - For each neighbor:
     - If it’s parent → skip
     - If visited → update low[curr]
     - If not visited → DFS deeper

3️⃣ Check articulation conditions:
   - For non-root nodes:
       if (dt[curr] <= low[neighbor]) → curr is articulation
   - For root node:
       if (child > 1) → root is articulation

4️⃣ After DFS → print all articulation points

Graaph Representation:

0
| \
|  \
1---2
|
3
|
4

*/

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        getArticulation(graph, V);
    }
}

/*
OUTPUT:
Articulation Points:
1
3

Time Complexity: O(V + E)
Space Complexity: O(V)
*/