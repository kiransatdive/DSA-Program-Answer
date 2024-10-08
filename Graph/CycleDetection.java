package Graph;

import java.util.ArrayList;

public class CycleDetection {
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
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 4));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean visit[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {   //visit all nodes 1 by 1
            if (!visit[i]) {
                if (detectCycleUtil(graph, visit, i, -1)) {
                    return true; // cycle exists in one of the parts
                }
            }
        }
        return false; // no cycle found
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean visit[], int curr, int par) {
        visit[curr] = true;
 
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visit[e.dest]) {
                if (detectCycleUtil(graph, visit, e.dest, curr)) {
                    return true; // case 1
                }
            }
            // case 1 should come before case 2
            else if (e.dest != par) {
                return true; // case 2 do nating -> continue
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}
