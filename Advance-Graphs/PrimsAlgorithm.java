import java.util.*;

public class PrimsAlgorithm {
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair> {
        int v;
        int wt;

        public Pair(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.wt - p2.wt;
        }
    }

    // O(E log E)
    public static void primAlgo(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int cost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                cost += curr.wt;

                for (Edge e : graph[curr.v]) {
                    if (!vis[e.dest]) {
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }

        System.out.println("Minimum Spanning Tree cost: " + cost);
    }

    /*
Graph Representation:

        (0)
       / | \
    10/ 15| 30
     /    |    \
   (1)    |    (3)
     \    |   /
     40\  | 50
        \ | /
         (2)

Edges with weights:
0 -> 1 (10), 0 -> 2 (15), 0 -> 3 (30)
1 -> 0 (10), 1 -> 3 (40)
2 -> 0 (15), 2 -> 3 (50)
3 -> 1 (40), 3 -> 2 (50)

Steps to implement Prim's Algorithm:

1. Create the graph using adjacency list with edges and weights.
2. Initialize a boolean visited[] array to keep track of visited vertices.
3. Use a PriorityQueue<Pair> to select the edge with the minimum weight at every step.
4. Add the source vertex (0) to the queue with weight 0.
5. While the priority queue is not empty:
   a) Remove the vertex with the minimum weight.
   b) If it is not visited, mark it visited and add its weight to the MST cost.
   c) For all adjacent vertices, if not visited, add them to the priority queue with their edge weight.
6. Continue until all vertices are visited.
7. The sum of all selected edges gives the Minimum Spanning Tree (MST) cost.

*/
    public static void main(String args[]) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        primAlgo(graph);
    }
}

/*
 OUTPUT:
  Minimum Spanning Tree cost: 55
  
Time Complexity: O(E log E) 
     where E = number of edges
Space Complexity: O(V + E) for adjacency list

 */