import java.util.Scanner;

public class G9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        int adjMatrix[][] = new int[n][n];

        for (int i = 0; i < e; i++) {

            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();

            adjMatrix[v1][v2] = weight;
            adjMatrix[v2][v1] = weight;
        }
        dijkstra(adjMatrix);
        sc.close();

    }

    private static void dijkstra(int[][] adjMatrix) {
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];
        int[] distance = new int[n];
        parent[0] = -1;
        distance[0] = 0;

        for (int i = 1; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            int minvertex = findminvertex(distance, visited);
            visited[minvertex] = true;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && adjMatrix[minvertex][j] > 0 && adjMatrix[minvertex][j] != Integer.MAX_VALUE) {
                    if (distance[j] > (distance[minvertex] + adjMatrix[minvertex][j])) {
                        distance[j] = (distance[minvertex] + adjMatrix[minvertex][j]);
                        parent[j] = minvertex;
                    }
                }
            }

            // printing the shortest path
            System.out.println("shortest distance between source and vertex are:-------");
            for (int j = 0; j < distance.length; j++) {
                System.out.println(j + " " + distance[j]);
            }

        }
    }

    private static int findminvertex(int[] distance, boolean[] visited) {
        int minvertex = -1;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && (minvertex == -1 || distance[i] < distance[minvertex])) {
                minvertex = i;
            }
        }
        return minvertex;
    }
}
