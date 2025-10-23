import java.util.ArrayList;
public class DFS {
    static class Edge {
        int src;
        int dest;
        Edge(int s, int d) {
            src = s;
            dest = d; 
        }
    }
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));
        graph[2].add(new Edge(2, 5));
        graph[2].add(new Edge(2, 6));
        graph[3].add(new Edge(3, 7));
        graph[4].add(new Edge(4, 7));
        graph[5].add(new Edge(5, 6));
        // Node 6 and 7 have no outgoing edges, graph[6] and graph[7] remain empty
    }
    public static void dfs(ArrayList<Edge>[] graph, boolean[] visited, int curr) {
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, visited, e.dest);
            }
        }
    }
    /*
     * DFS (Depth-First Search) Algorithm:
     * 1. Start from a given node and mark it as visited.
     * 2. Process the current node (e.g., print it).
     * 3. Recursively visit all unvisited adjacent nodes.
     * 4. Repeat until all nodes in the connected component are visited.
     * 5. To handle disconnected graphs, iterate through all nodes and perform DFS for unvisited nodes.
     * 6. This ensures all components of the graph are covered.

     Graph Representation:
             0
            / \
            1   2
            / \ / \
           3  4 5  6
    */
public static void main(String[] args) {
    int V = 8; // Number of vertices
    ArrayList<Edge>[] graph = new ArrayList[V];
    createGraph(graph);
    boolean[] visited = new boolean[V];
    System.out.println("DFS Traversal of all components:");
    for (int i = 0; i < V; i++) {
        if (!visited[i]) {
            dfs(graph, visited, i);
        }
    }
}
}

/*
OUTPUT:
DFS Traversal of all components:
0 1 3 7 4 2 5 6

Time Complexity: O(V + E) where V is the number of vertices and E is the number of edges.
Space Complexity: O(V) for the visited array and the recursion stack.
*/