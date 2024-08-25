import java.util.Arrays;

public class DP12 {
    // minimun cost for tickets
    public static void main(String[] args) {
        int[] arr = { 2, 5 };
        int[] cost = { 1, 4, 25 };
        int[] dp = new int[arr.length + 1];
        Arrays.fill(dp, -1);
        // int ans = solve(0, arr, cost, dp);
        int ans = solveTab(arr.length, arr, cost);
        System.out.println(ans);
    }

    public static int solve(int index, int[] arr, int[] cost, int[] dp) {
        if (index >= arr.length) {
            return 0;
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        // 1 day pass
        int option1 = cost[0] + solve(index + 1, arr, cost, dp);
        // 7 day pass
        int i;
        for (i = index; i < arr.length && arr[i] < arr[index] + 7; i++) {
        }
        int option2 = cost[1] + solve(i, arr, cost, dp);
        // 30 day pass
        int j;
        for (j = index; j < arr.length && arr[j] < arr[index] + 30; j++) {
        }
        int option3 = cost[2] + solve(i, arr, cost, dp);
        dp[index] = Math.min(option1, Math.min(option2, option3));
        return dp[index];
    }

    public static int solveTab(int n, int[] arr, int[] cost) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n] = 0;
        for (int k = n - 1; k >= 0; k--) {
            // 1 day pass
            int option1 = cost[0] + dp[k + 1];
            // 7 day pass
            int i;
            for (i = k; i < arr.length && arr[i] < arr[k] + 7; i++) {
            }
            int option2 = cost[1] + dp[i];
            // 30 day pass
            int j;
            for (j = k; j < arr.length && arr[j] < arr[k] + 30; j++) {
            }
            int option3 = cost[2] + dp[i];
            dp[k] = Math.min(option1, Math.min(option2, option3));
        }
        return dp[0];
    }
}


