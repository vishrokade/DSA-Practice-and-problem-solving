package College;

import java.util.LinkedList;
public class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency list representation of the graph

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    // Function to add an edge to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    // Depth First Search (DFS) recursive function
    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor])
                DFSUtil(neighbor, visited);
        }
    }

    // Depth First Search (DFS) traversal
    void DFS(int v) {
        boolean[] visited = new boolean[V];
        DFSUtil(v, visited);
    }

    // Breadth First Search (BFS) traversal
    void BFS(int v) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[v] = true;
        queue.add(v);

        while (queue.size() != 0) {
            v = queue.poll();
            System.out.print(v + " ");

            for (Integer neighbor : adj[v]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Test the DFS and BFS algorithms
    public static void main(String args[]) {
        Graph graph = new Graph(6);

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        System.out.println("Depth First Search (DFS) traversal:");
        graph.DFS(0);

        System.out.println("\n\nBreadth First Search (BFS) traversal:");
        graph.BFS(0);
    }
}
