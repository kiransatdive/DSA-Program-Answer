package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class Topologicalsorting {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    public static void topsort(ArrayList<Edge>[] graph) {
        boolean visit[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {

            if (!visit[i]) {
                topsortUtil(graph, i, visit, s);// modify dfs

            }
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop()+" ");

        }
    }

    public static void topsortUtil(ArrayList<Edge>[] graph, int curr, boolean visit[], Stack<Integer> s) {
        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visit[e.dest]) {
                topsortUtil(graph, e.dest, visit, s);

            }
        }
        s.push(curr);

    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topsort(graph);

    }

}
