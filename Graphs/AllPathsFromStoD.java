import java.util.ArrayList;
public class AllPathsFromStoD {
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
    public static void allPaths(ArrayList<Edge>[] graph, int curr,boolean visited[], int dest, String path) {
        if (curr == dest) {
            System.out.println(path + dest);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                visited[e.dest] = true;
                allPaths(graph, e.dest, visited, dest, path + curr + "->");

                visited[e.dest] = false;
            }
        }
    }
    /*
        * All Paths from Source to Destination Algorithm:
        * 1. Start from the source node and maintain a path string.
        * 2. If the current node is the destination, print the path.
        * 3. Recursively explore all adjacent nodes, appending the current node to the path.
        * 4. Backtrack to explore other paths until all paths from source to destination
        *    are found.

        Graph Representation:
                0
               / \
               1   2
               / \ / \
              3  4 5--6
               \ |
                 7
     */
    public static void main(String[] args) {
        int V = 8; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int source = 0;
        int destination = 7;
        boolean visited[] = new boolean[V];
        visited[source] = true;
        System.out.println("All paths from " + source + " to " + destination + ":");
        allPaths(graph, source,visited, destination, "");
    }
}

/*
 OUTPUT:
All paths from 0 to 7:
0->1->3->7
0->1->4->7

Time Complexity: O(V^V) in the worst case, where V is the number of vertices and E is the number of edges.
Space Complexity: O(V) for the recursion stack and path storage.

 */