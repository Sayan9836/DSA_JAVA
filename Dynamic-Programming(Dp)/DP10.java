import java.util.Arrays;

public class DP10 {

    // combination IV
    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        int target = 3;
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);
        // int ans = solve(arr, target, dp);
         int ans = solveTab(arr, target);

        System.out.println(ans);
    }

    public static int solve(int[] arr, int target, int[] dp) {
        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return 0;
        }
        if (dp[target] != -1) {
            return dp[target];
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += solve(arr, target - arr[i], dp);
        }
        dp[target] = result;

        return result;
    }

    public static int solveTab(int[] arr, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        if (target < 0) {
            return 0;
        }

        for (int i = 1; i <=target; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i-arr[j]>=0)
                dp[i]+= dp[i - arr[j]];
            }
        }

        return dp[target];
    }
}
