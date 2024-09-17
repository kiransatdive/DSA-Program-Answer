package Graph;

import java.util.*;

public class KosarajuAlgo {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();

        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

    }

    public static void topsort(ArrayList<Edge>[] graph, int curr, boolean visit[], Stack<Integer> s) {
        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visit[e.dest]) {
                topsort(graph, e.dest, visit, s);

            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean visit[]) {
        visit[curr] = true;

        System.out.println(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visit[e.dest]) {
                dfs(graph, e.dest, visit);

            }
        }
    }

    public static void Kosaraju(ArrayList<Edge>[] graph, int V) {
        // step 1 Store vertices in Topological Sort order
        Stack<Integer> s = new Stack<>();
        boolean visit[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visit[i]) {
                topsort(graph, i, visit, s);

            }
        }
        // Step 2  Reverse all edges of the Graph

        ArrayList<Edge> transpose[] = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            visit[i] = false;
            transpose[i] = new ArrayList<Edge>();

        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j); // e.src=>e.dest
                transpose[e.dest].add(new Edge(e.dest, e.src)); // reverse edge
            }

        }

        // step3 One by One pop elements from top of the stack and Count/Store and Mark the elements visited by current vertex

        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!visit[curr]) {

                System.out.print("SCC =>");
                dfs(transpose, curr, visit);

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        Kosaraju(graph, V);

    }
}
