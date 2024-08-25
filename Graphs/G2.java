import java.util.Scanner;
// DFS traversal in a graph
public class G2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        int adjMatrix[][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        DFS(adjMatrix);
        sc.close();
    }

    private static void DFS(int[][] adjMatrix) {
        boolean[] visited = new boolean[adjMatrix.length];
        int count=0;
        for (int j = 0; j < adjMatrix.length; j++) {
            if (!visited[j]) {
                DFS(adjMatrix, j, visited);
                count++;// Number of connected component in undirected graph
            }
        }

    }

    private static void DFS(int[][] adjMatrix, int currentVertex, boolean[] visited) {
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[currentVertex][i] == 1 && visited[i] != true) {
                DFS(adjMatrix, i, visited);
            }
        }
    }

}
