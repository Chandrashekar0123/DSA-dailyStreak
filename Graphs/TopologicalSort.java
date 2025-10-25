import java.util.*;

public class TopologicalSort {
    // Edge class to represent a directed edge from src -> dest
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Function to create the directed graph using adjacency list
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // Recursive DFS function to perform topological sort
    public static void topoSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                topoSortUtil(graph, e.dest, vis, s);
            }
        }

        s.push(curr); // push node to stack after visiting all neighbors
    }

    // Function to perform topological sort
    public static void topoSort(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < graph.length; i++) {
            if(!vis[i]) {
                topoSortUtil(graph, i, vis, s);
            }
        }

        while(!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
/*
Graph representation (Directed):

    5 → 0
    5 → 2 → 3 → 1
    4 → 0
    4 → 1

     5               4
     |\             /|
     |  \          / |
     |   \        /  |
     |     > 0  <    |
     |               \/
    \/               1
    2               /\
     \              |
       \            /
        \          /
         \---> 3---

Steps to perform Topological Sort:
1. Create the graph using adjacency list.
2. Initialize a visited[] array and an empty stack.
3. For each unvisited node, call topoSortUtil():
   a. Mark current node as visited.
   b. Recursively visit all unvisited neighbors.
   c. After visiting neighbors, push the current node onto the stack.
4. After DFS of all nodes, pop elements from the stack to get the topological order.
*/
    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println("Topological Sort of the Graph:");
        topoSort(graph);
    }
}

/*
OUTPUT:
Topological Sort of the Graph:
5 4 2 3 1 0 

Time Complexity: O(V + E) where V is number of vertices and E is number of edges.

Explanation:
The topological sort order is one of the valid linear orderings of the directed acyclic graph
*/
