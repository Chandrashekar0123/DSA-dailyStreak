import java.util.*;
public class BFS {
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

    public static void bfs(ArrayList<Edge>[] graph, boolean[] visited, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    /*
     * BFS (Breadth-First Search) Algorithm:
     * 1. Initialize a queue and add the starting node to it.
     * 2. While the queue is not empty:
     *    a. Dequeue a node from the queue.
     *    b. If the node has not been visited:
     *       i. Mark it as visited and process it (e.g., print it).
     *       ii. Enqueue all its unvisited adjacent nodes.
     3. Repeat until all nodes in the connected component are visited.
     4. To handle disconnected graphs, iterate through all nodes and perform BFS for unvisited nodes.
     5. This ensures all components of the graph are covered.

     Graph Representation:
             0
            / \
            1   2
            / \ / \
           3  4 5--6
            \ /   
             7
     */

    public static void main(String[] args) {
        int V = 8;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean[] visited = new boolean[V];

        System.out.println("BFS Traversal of all components:");
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                bfs(graph, visited, i);
                System.out.println(); // separate components by newline
            }
        }
    }
}

/*
OUTPUT:
BFS Traversal of all components:
0 1 2 3 4 5 6 7

Time Complexity: O(V + E) where V is the number of vertices and E is the number of edges.
Space Complexity: O(V) for the visited array and the queue.
 */
