import java.util.*;

public class Kosaraju {

    // Edge class to represent directed edges
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create the graph
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
    }

    // Topological sort helper
    public static void topSort(ArrayList<Edge> graph[], int curr, Stack<Integer> s, boolean vis[]) {
        vis[curr] = true;
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                topSort(graph, e.dest, s, vis);
            }
        }
        s.push(curr);
    }

    // DFS for SCC traversal
    public static void dfs(ArrayList<Edge> graph[], boolean vis[], int curr) {
        vis[curr] = true;
        System.out.print(curr + " ");
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                dfs(graph, vis, e.dest);
            }
        }
    }

    // Kosaraju's algorithm to find SCCs
    public static void kosaraju(ArrayList<Edge> graph[], int V) {
        // Step 1: Topological sort
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSort(graph, i, s, vis);
            }
        }

        // Step 2: Create transpose graph
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            transpose[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i < V; i++) {
            vis[i] = false; // reset visited array
            for (Edge e : graph[i]) {
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Step 3: DFS on transpose graph in order of topological sort
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                System.out.print("SCC: ");
                dfs(transpose, vis, curr);
                System.out.println();
            }
        }
    }
/*
    Graph Representation:

      0 → 2
      ↓   ↑
      3   1
      ↓
      4

Explanation:
- Directed graph with 5 vertices (0 to 4)
- Edges:
    0 → 2, 0 → 3
    1 → 0
    2 → 1
    3 → 4

Steps followed in Kosaraju's Algorithm:

1. **Topological Sort**:
   - Perform DFS on the original graph.
   - Push vertices to a stack in the order of completion.

2. **Transpose the Graph**:
   - Reverse the direction of all edges to get the transpose graph.

3. **DFS on Transpose Graph**:
   - Pop vertices from the stack (from topological sort order).
   - For each unvisited vertex, perform DFS in the transpose graph.
   - All vertices visited in one DFS call form a Strongly Connected Component (SCC).

*/
    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
}

/*
 OUTPUT:
SCC: 0 1 2 
SCC: 3 
SCC: 4 

Time Complexity: O(V + E)
Space Complexity: O(V + E)
 */