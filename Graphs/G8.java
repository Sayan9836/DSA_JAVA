import java.util.Scanner;

public class G8 {
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
        boolean visited[] = new boolean[n];
        int[] parent = new int[n];
        int[] weight = new int[n];
        weight[0] = 0;
        parent[0] = -1;
        for (int i = 1; i < weight.length; i++) {
            weight[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            // find minVertex:-------
            int minvertex = findminvertex(weight, visited);
            visited[minvertex] = true;

            // Expanding neighbours of minVertex
            for (int j = 0; j < n; j++) {
                if (!visited[j] && adjMatrix[minvertex][j] != 0) {
                    if (weight[j] > adjMatrix[minvertex][j]) {
                        weight[j] = adjMatrix[minvertex][j];
                        parent[j] = minvertex;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < parent[i]) {
                System.out.println(i + " " + parent[i] + " " + weight[i]);
            } else {
                System.out.println(parent[i] + " " + i + " " + weight[i]);
            }

        }
        sc.close();
    }

    private static int findminvertex(int[] weight, boolean[] visited) {
        int minvertex = -1;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && (minvertex == -1 || weight[i] < weight[minvertex])) {
                minvertex = i;
            }
        }
        return minvertex;
    }
}
