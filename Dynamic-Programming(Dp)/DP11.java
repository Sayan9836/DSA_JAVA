import java.util.Arrays;

// no of perfect squares
public class DP11 {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = solve(n, dp);
        System.out.println(ans);
    }

    public static int solve(int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int ans = n;
        for (int i = 1; i * i <= n; i++) {
            ans = Math.min(ans, 1 + solve(n - i * i, dp));
        }
        dp[n] = ans;
        return dp[n];
    }

    public static int solveTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j * j <= n; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }

        return dp[n];

    }
}
