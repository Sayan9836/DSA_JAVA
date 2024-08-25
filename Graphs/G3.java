import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class G3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// no of vertices
        int e = sc.nextInt();// no of edges
        int adjMatrix[][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        BFS(adjMatrix);
        sc.close();
    }

    private static void BFS(int[][] adjMatrix) {
        boolean visited[] = new boolean[adjMatrix.length];
        for (int i = 0; i < adjMatrix.length; i++) {
            if (!visited[i]) {
                BFS(adjMatrix, i, visited);
            }
        }
    }

    private static void BFS(int[][] adjMatrix, int currenvertex, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();

        visited[currenvertex] = true;
        q.add(currenvertex);
        while (!q.isEmpty()) {

            int front = q.poll();
            System.out.print(front + " ");
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[front][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }

            }
        }
    }
}
