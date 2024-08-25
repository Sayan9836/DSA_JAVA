import java.util.Arrays;

public class DP9 {
    public static void main(String[] args) {
        int[] value = { 6, 5, 1, 5, 6, 5, 9 };
        int[] weight = { 5, 3, 4, 9, 6, 1, 1 };
        int n = 7;
        int capacity = 63;
        int[][] dp = new int[n][capacity + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = knapsack(weight, value, n - 1, capacity, dp);
        System.out.println(ans);
    }

    public static int knapsack(int[] weight, int[] value, int n, int capacity, int[][] dp) {
        if (n == 0) {
            if (weight[0] <= capacity) {
                return value[0];
            } else {
                return 0;
            }
        }

        if (dp[n][capacity] != -1) {
            return dp[n][capacity];
        }

        int include = 0;
        if (weight[n] <= capacity) {
            include = value[n] + knapsack(weight, value, n - 1, capacity - weight[n], dp);
        }
        int exclude = knapsack(weight, value, n - 1, capacity, dp);

        dp[n][capacity] = Math.max(include, exclude);
        return dp[n][capacity];
    }

    public static int knapsackTab(int[] weight, int[] value, int n, int capacity) {
        int[][] dp = new int[n][capacity + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        for (int w = weight[0]; w <= capacity; w++) {
            if (weight[0] <= capacity) {
                dp[0][w] = value[0];
            } else {
                dp[0][w] = 0;
            }
        }

        for (int i = 1; i < n; i++) {

            for (int w = 0; w <= capacity; w++) {
                int include = 0;
                if (weight[i] <= w) {
                    include = value[n] + dp[i - 1][w - weight[i]];
                    int exclude = value[n] + dp[i - 1][w];
                    dp[i][w] = Math.max(include, exclude);
                }
            }
        }

        return dp[n - 1][capacity];
    }


    public static int knapsackSpaceOp(int[] weight, int[] value, int n, int capacity) {
        int[] prev = new int[capacity + 1];
        int[] curr = new int[capacity + 1];
        for (int w = weight[0]; w <= capacity; w++) {
            if (weight[0] <= capacity) {
                prev[w] = value[0];
            } else {
                prev[w] = 0;
            }
        }

        for (int i = 1; i < n; i++) {

            for (int w = 0; w <= capacity; w++) {
                int include = 0;
                if (weight[i] <= w) {
                    include = value[n] + prev[w - weight[i]];
                    int exclude = value[n] + prev[w];
                    curr[w] = Math.max(include, exclude);
                }
            }
        }
        prev = curr;

        return prev[capacity];
    }

    // More optimished version

    public static int knapsackMoreOp(int[] weight, int[] value, int n, int capacity) {
        
        int[] curr = new int[capacity + 1];
        for (int w = weight[0]; w <= capacity; w++) {
            if (weight[0] <= capacity) {
                curr[w] = value[0];
            } else {
                curr[w] = 0;
            }
        }

        for (int i = 1; i < n; i++) {

            for (int w = capacity; w>=0; w--) {
                int include = 0;
                if (weight[i] <= w) {
                    include = value[n] + curr[w - weight[i]];
                    int exclude = value[n] + curr[w];
                    curr[w] = Math.max(include, exclude);
                }
            }
        }
        
        return curr[capacity];
    }
}
