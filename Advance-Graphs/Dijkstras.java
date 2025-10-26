import java.util.*;

public class Dijkstras {

    // Edge class to represent weighted edges
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

    // Create a sample weighted directed graph
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    // Pair class used in PriorityQueue (node, distance)
    static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        public Pair(int n, int d) {
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair other) {
            return this.dist - other.dist; // ascending order by distance
        }
    }

    // Dijkstra’s Algorithm → O(E logV)
    public static int[] dijkstra(ArrayList<Edge>[] graph, int src) {
        int V = graph.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        boolean[] vis = new boolean[V];

        // Initialize distances
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!vis[curr.node]) {
                vis[curr.node] = true;

                for (Edge e : graph[curr.node]) {
                    int u = e.src;
                    int v = e.dest;
                    int weight = e.wt;

                    // Relaxation step
                    if (!vis[v] && dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        return dist;
    }

    /*
        Main method to test Dijkstra's algorithm

        1. Initialize all distances as infinity except the source (dist[src] = 0).
        2. Use a min-priority queue (based on shortest distance).
        3. Extract the vertex with the smallest distance.
        4. Update (relax) distances to its neighbors if a shorter path is found.
        5. Repeat until all vertices are processed.

Weighted Directed Graph used in Dijkstra’s Algorithm Example:

         (2)
     0 ------> 1
     |          \
  (4)|           \(7)
     |             \
     v (1)          v
     2 -----> 4 ----> 3 -----> 5
      \      ^  \         ^
       \   (3)|   \(5)   /
        \_____|_____\___/
              (2)

Edges with weights:
0 → 1 (2)
0 → 2 (4)
1 → 3 (7)
1 → 2 (1)
2 → 4 (3)
4 → 3 (2)
4 → 5 (5)
3 → 5 (1)

Shortest path from source 0:
0 → 1 → 2 → 4 → 3 → 5
*/
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        int[] dist = dijkstra(graph, src);

        System.out.println("Shortest distances from source node " + src + ":");
        for (int i = 0; i < dist.length; i++) {
            System.out.println("Vertex " + i + " → Distance = " + dist[i]);
        }
    }
}

/*
OUTPUT :
Shortest distances from source node 0:
Vertex 0 → Distance = 0
Vertex 1 → Distance = 2
Vertex 2 → Distance = 3
Vertex 3 → Distance = 8
Vertex 4 → Distance = 6
Vertex 5 → Distance = 9

Time Complexity: O(E + E log V)
    where V is the number of vertices and E is the number of edges in the graph.
Space Complexity: O(V)
        for distance array, visited array, and priority queue.
*/