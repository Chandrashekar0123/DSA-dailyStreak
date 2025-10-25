import java.util.*;

public class CycleDirected {
    static class Edge {
        int src, dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    // Single function for DFS cycle detection
    public static boolean isCyclic(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;

        for (Edge e : graph[curr]) {
            if (stack[e.dest]) return true;         // cycle detected
            if (!vis[e.dest] && isCyclic(graph, e.dest, vis, stack)) return true;
        }

        stack[curr] = false;
        return false;
    }
/*
Graph representation (Directed):

0 → 2
1 → 0
2 → 3
3 → 0

Steps / Logic to detect cycle in a directed graph:

1. Create the graph using adjacency list.
2. Initialize visited[] and recursionStack[] arrays as false.
3. For each unvisited node, call isCyclic(graph, node, visited, recursionStack).
4. In isCyclic():
   a. Mark current node as visited and add to recursion stack.
   b. For each neighbor:
      i. If neighbor is in recursion stack → cycle found.
      ii. Else if neighbor is unvisited → recursively call isCyclic on neighbor.
   c. Remove current node from recursion stack after DFS.
5. If any DFS returns true → cycle detected; else → no cycle.
*/

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean vis[] = new boolean[V];
        boolean stack[] = new boolean[V];
        boolean cycle = false;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (isCyclic(graph, i, vis, stack)) {
                    cycle = true;
                    break;
                }
            }
        }

        if (cycle) System.out.println("Cycle detected");
        else System.out.println("No Cycle");
    }
}

/*
OUTPUT:
Cycle detected

Time Complexity: O(V + E) where V is number of vertices and E is number of edges.

Explanation:
The directed graph contains a cycle: 0 → 2 → 3 → 0. The DFS traversal detects this cycle and outputs "Cycle detected".
*/