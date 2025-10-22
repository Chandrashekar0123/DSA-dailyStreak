import java.util.*;

class CreateGraphOfGraph {

    // Define Edge class (inner static class)
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create the graph
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Add edges
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 2));
    }

    /*
    Graph representation:
        0
       / \
      1   2
      |    \
      3     4
    */
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        // Print the graph
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + ":");
            for (Edge e : graph[i]) {
                System.out.print(" -> " + e.dest);
            }
            System.out.println();
        }
    }
}

/*
OUTPUT:
Vertex 0: -> 1 -> 2
Vertex 1: -> 0 -> 3
Vertex 2: -> 0 -> 4
Vertex 3: -> 1
Vertex 4: -> 2

Time Complexity: O(X) where X is the total number of edges in the graph.
Space Complexity: O(V + X) where V is the number of vertices and X is the

*/