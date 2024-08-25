import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge> {

    int v1;
    int v2;
    int weight;

    Edge(int v1, int v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge e) {
        return this.weight - e.weight;
    }

}

public class G7 {

    private static int findParent(int v, int[] parent) {
        if (parent[v] == v) {
            return v;
        }
        return findParent(parent[v], parent);
    }



    private static Edge[] KruskalAlgorithm(Edge[] edge, int n) {
        Arrays.sort(edge);
        Edge mst[] = new Edge[n - 1];
        int[] parent = new int[n];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        int count = 0;
        int j = 0;
        while (count != n - 1) {
            
            Edge currEdge = edge[j++];
            int parentv1 = findParent(currEdge.v1, parent);
            int parentv2 = findParent(currEdge.v2, parent);
              
            if (parentv1 != parentv2) {
                mst[count++] = currEdge;
                parent[parentv1] = parentv2;
            }
        }

        return mst;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of vertices and Edges");
        int n = sc.nextInt();
        int e = sc.nextInt();

        Edge[] edge = new Edge[e];
        System.out.println("Enter the Egdes");
        for (int i = 0; i < edge.length; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            Edge edges = new Edge(v1, v2, weight);
            edge[i] = edges;
        }
        Edge[] mst = KruskalAlgorithm(edge, n);

        System.out.println("the minimum Spanning tree of the given graph is:-----");
        for (int i = 0; i < mst.length; i++) {
            System.out.println(
                    Math.min(mst[i].v1, mst[i].v2) + " " + Math.max(mst[i].v1, mst[i].v2) + " " + mst[i].weight);

        }
        sc.close();




    }
}
