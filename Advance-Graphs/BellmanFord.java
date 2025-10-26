import java.util.*;

public class BellmanFord {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Relax all edges V-1 times
        for (int i = 0; i < graph.length - 1; i++) {
            for (int u = 0; u < graph.length; u++) {
                for (Edge e : graph[u]) {
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[e.dest]) {
                        dist[e.dest] = dist[u] + e.wt;
                    }
                }
            }
        }

        // Check for negative weight cycles
        for (int u = 0; u < graph.length; u++) {
            for (Edge e : graph[u]) {
                if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[e.dest]) {
                    System.out.println("Negative weight cycle exists");
                    return;
                }
            }
        }

        // Print distances
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    /*

    Steps to implement Bellman-Ford Algorithm:

1. Initialize distances:
   - Create a dist[] array for all vertices.
   - Set dist[src] = 0 and all others to infinity.

2. Relax all edges V-1 times:
   - For each vertex u:
       - For each edge (u → v) with weight w:
           - If dist[u] + w < dist[v], update dist[v] = dist[u] + w

3. Check for negative weight cycles:
   - For each edge (u → v) with weight w:
       - If dist[u] + w < dist[v], a negative cycle exists.

4. Output:
   - Print dist[] array for shortest distances from source vertex.


    Weighted Directed Graph:

         (2)
     0 --------> 1
     |            \
b (4)|             \(-4)
     |               \
     v                v
     2 -------> 3 ----> 4
                    ^
                    |
                   (-1)
                    |
                    4
Edges with weights:
0 → 1 : 2
0 → 2 : 4
1 → 2 : -4
2 → 3 : 2
3 → 4 : 4
4 → 1 : -1
    */

    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        bellmanFord(graph, src);
    }
}

/*
OUTPUT:
0 2 -2 0 4 

Time Complexity: O(V * E) where V is the number of vertices and E is the number of edges.

*/