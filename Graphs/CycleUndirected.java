import java.util.*;

public class CycleUndirected {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create graph using adjacency list
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    // DFS utility to detect cycle
    public static boolean isCyclicUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int parent) {
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            // If neighbor is visited and not parent → cycle
            if (vis[e.dest] && e.dest != parent) {
                return true;
            }
            // If neighbor not visited, recurse
            if (!vis[e.dest]) {
                if (isCyclicUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Check for cycle in entire graph
    public static boolean isCyclic(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCyclicUtil(graph, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
    Steps to detect cycle in an undirected graph using DFS:

    1. Create the graph using adjacency list.
    2. Initialize visited[] array as false for all vertices.
    3. For each unvisited vertex, call isCyclicUtil(vertex, parent = -1):
        - Mark vertex as visited.
        - For each neighbor:
            a) If neighbor is visited and not parent → cycle detected.
            b) If neighbor is not visited → recursively call isCyclicUtil(neighbor, current vertex).
    4. If any DFS call returns true → cycle exists, else no cycle.

    Graph used in this example:
            0 ------- 3
           /|         |
          / |         |
         1  |         4
          \ |
           \|
            2
    */

    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        if (isCyclic(graph))
            System.out.println("Cycle detected");
        else
            System.out.println("No Cycle");
    }
}

/*
OUTPUT:
Cycle detected

Explanation:
The graph contains a cycle: 0 -> 1 -> 2 -> 0. DFS detects this cycle.

Time Complexity: O(V + E), where V = number of vertices, E = number of edges.
Space Complexity: O(V) for the visited array and recursion stack.
*/
