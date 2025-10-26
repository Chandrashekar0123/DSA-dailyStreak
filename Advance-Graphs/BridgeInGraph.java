import java.util.*;

public class BridgeInGraph {

    static class Edge {
        int src, dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Function to find bridges using Tarjan’s Algorithm
    public static void dfs(ArrayList<Edge>[] graph, int curr, int par, boolean[] vis,
                           int[] dt, int[] low, int time) {

        vis[curr] = true;
        dt[curr] = low[curr] = ++time; // discovery & low time

        for (Edge e : graph[curr]) {
            if (e.dest == par) continue; // Skip the parent edge

            if (vis[e.dest]) {
                // Back edge
                low[curr] = Math.min(low[curr], dt[e.dest]);
            } else {
                // Tree edge
                dfs(graph, e.dest, curr, vis, dt, low, time);
                low[curr] = Math.min(low[curr], low[e.dest]);

                // Bridge condition
                if (dt[curr] < low[e.dest]) {
                    System.out.println("BRIDGE: " + curr + " --- " + e.dest);
                }
            }
        }
    }

    public static void getBridge(ArrayList<Edge>[] graph, int V) {
        boolean[] vis = new boolean[V];
        int[] dt = new int[V];   // discovery time
        int[] low = new int[V];  // lowest discovery time reachable
        int time = 0;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, vis, dt, low, time);
            }
        }
    }

    // Example graph creation
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));
        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));
        graph[1].add(new Edge(1, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
    }

/*

   0
  / \
 1---2
 |
 3
 |
 4

Steps to Find Bridges

1. **Initialize Arrays**
   - `vis[]` → Keeps track of visited nodes.  
   - `dt[]` → Stores discovery time for each vertex.  
   - `low[]` → Stores the earliest reachable ancestor discovery time.  
   - `time` → Keeps increasing with every DFS visit.

2. **Perform DFS Traversal**
   - Visit each unvisited vertex.  
   - Mark current vertex as visited and assign `dt[curr] = low[curr] = ++time`.

3. **Check Each Neighbor**
   - If the neighbor is **parent**, skip it.  
   - If the neighbor is **already visited**, update `low[curr] = min(low[curr], dt[neighbor])`.  
   - If the neighbor is **unvisited**, recursively perform DFS.

4. **Bridge Condition**
   - After returning from recursion, check:
     ```
     if (dt[curr] < low[neighbor])
         → Edge (curr, neighbor) is a BRIDGE.
     ```
   - This means removing this edge increases the number of connected components.

5. **Continue DFS**
   - Repeat until all vertices are processed.

*/

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        getBridge(graph, V);
    }
}

/*
OUTPUT:
BRIDGE: 3 --- 4
BRIDGE: 1 --- 3


Bridge → An edge whose removal increases the number of connected components.  
Use Case → Network reliability, articulation point detection, graph partitioning.

⏱️ Time & Space Complexity

| Operation | Complexity |
|------------|-------------|
| DFS Traversal | O(V + E) |
| Space Used | O(V) |



🔍 Steps of Tarjan’s Bridge Algorithm

   1. Perform DFS traversal.
   2. Assign each vertex:
      - Discovery Time (dt): When it's first visited.
      - Low Time (low): The earliest discovered vertex reachable.
   3. For each edge (u → v):
      - If low[v] > dt[u], then (u, v) is a bridge.
   4. Continue until all vertices are visited.
*/