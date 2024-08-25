import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// is there's a path between sv and ev 

public class G4 {
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

        System.out.println(BFS(adjMatrix, 0, 4));
        sc.close();
    }

    private static boolean BFS(int[][] adjMatrix, int sv, int ev) {
        boolean[] visited = new boolean[adjMatrix.length];
        return BFS(adjMatrix, sv, ev, visited);
    }

    private static boolean BFS(int[][] adjMatrix, int sv, int ev, boolean[] visited) {

        if (sv > adjMatrix.length - 1 || ev > adjMatrix.length - 1) {
            return false;
        }
        if (adjMatrix[sv][ev] == 1) {
            return true;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        visited[sv] = true;
        while (!q.isEmpty()) {
            int front = q.poll();
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[front][i] == 1 && !visited[i]) {
                    if (i == ev) {
                        return true;
                    } else {
                        q.add(i);
                        visited[i] = true;
                    }
                }
            }
        }
        return false;

    }
}
