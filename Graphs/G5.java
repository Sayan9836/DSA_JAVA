import java.util.ArrayList;
import java.util.Collections;
//import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
//import java.util.List;
import java.util.Queue;
import java.util.Scanner;

// Shortest path using bfs

public class G5 {
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

        ArrayList<Integer> arr = BFS(adjMatrix, 1, 3);
        Collections.reverse(arr);
        System.out.println(arr);
        sc.close();
    }

    static int l = 0;

    private static ArrayList<Integer> BFS(int[][] adjMatrix, int sv, int ev) {
        boolean[] visited = new boolean[adjMatrix.length];
        return BFS(adjMatrix, sv, ev, visited);
    }

    private static ArrayList<Integer> BFS(int[][] adjMatrix, int sv, int ev, boolean[] visited) {
        ArrayList<Integer> list = new ArrayList<>();
        // int[] arr = new int[adjMatrix.length];
        if (sv > adjMatrix.length - 1 || ev > adjMatrix.length - 1) {
            list.add(-1);
            return list;
        }
        if (sv == ev) {
            list.add(sv);
            return list;
        }
        if (adjMatrix[sv][ev] == 1) {
            list.add(ev);
            list.add(sv);
            return list;
        }

        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        q.add(sv);
        map.put(sv, -1);
        visited[sv] = true;
        // int i = 0;
        while (!q.isEmpty()) {
            int front = q.poll();
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[front][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    map.put(i, front);
                    if (i == ev) {
                        break;
                    }

                }
            }
        }

        int a = ev;
        while (a != sv) {
            list.add(a);
            a = map.get(a);
        }
        list.add(a);
        return list;
    }

}