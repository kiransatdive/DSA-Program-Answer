package Graph;

import java.util.*;

class DijkstraAlgorithm {
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

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;

        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // path based msorting for my pairs
        }
    }

    public static void dij(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length]; // dist[i]->src to i
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // +infinifty
            }
        }
        boolean visit[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        // loop

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!visit[curr.n]) {
                visit[curr.n] = true;

                // neighbours
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                           //relaxsation
                    if (dist[u] + wt < dist[v]) { // update distance
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));

                    }
                }
            }
        }
        // print all source to vertices shortest dist
        for (int i = 0; i < dist.length; i++) {
            System.out.println(dist[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        dij(graph, src);

    }
}
