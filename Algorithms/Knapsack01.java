import java.util.Scanner;

public class Knapsack01 {
    public static void main(String[] args) {
        System.out.println("enter the no of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] vals = new int[n];
        int[] wt = new int[n];

        System.out.println("enter the price of items: ");
        for (int i = 0; i < n; i++) {
            vals[i] = sc.nextInt();
        }
        System.out.println("enter the weight of the items: ");
        for (int j = 0; j < n; j++) {
            wt[j] = sc.nextInt();
        }
        System.out.println("enter the maximum capacity of Knapsack");
        int cap = sc.nextInt();

        int[][] dp = new int[n + 1][cap + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j >= wt[i - 1]) {
                    int rem = j - wt[i - 1];
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][rem] + vals[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        sc.close();
        System.out.println("maximum value stored in the Knapsack is---" + dp[n][cap]);
    }
}