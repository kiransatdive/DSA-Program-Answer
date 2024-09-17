package Graph;

import java.util.*;

public class CycledetectDFS {
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

    public static boolean iscycle(ArrayList<Edge>[] graph) {
        boolean[] visit = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                if (iscycleutil(graph, i, visit, stack)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean iscycleutil(ArrayList<Edge>[] graph, int curr, boolean[] visit, boolean[] stack) {
        visit[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) { // visit all nodes
            Edge e = graph[curr].get(i);

            if (stack[e.dest]) {
                return true;
            } else

            if (!visit[e.dest] && iscycleutil(graph, e.dest, visit, stack)) {
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        System.out.println(iscycle(graph));
    }
}
