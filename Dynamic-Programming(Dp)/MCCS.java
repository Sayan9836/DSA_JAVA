import java.util.Arrays;

public class MCCS {
  // Minimum cost climbing stairs
  public static void main(String[] args) {
    int[] arr = { 10, 15, 20 };
    int n = 3;
    int[] dp = new int[n + 1];
    // Arrays.fill(dp, -1);
    // int ans=Math.min(Helper(arr,n-1),Helper(arr,n-2));
    // int ans=Math.min(Helper(arr,n-1,dp),Helper(arr,n-2,dp));
    // int ans=Helper(arr, n, dp);
      int ans=Helper(arr, n);
    System.out.println(ans);
  }

  // Using plain recurrsion
  // static int Helper(int[] arr,int n){

  // if (n==0||n==1) {
  // return arr[n];
  // }

  // int ans= arr[n]+ Math.min(Helper(arr,n-1),Helper(arr,n-2));
  // return ans;
  // }

  // Memoization
  // static int Helper(int[] arr,int n,int[]dp){

  // if (n==0||n==1) {
  // return arr[n];
  // }
  // if (dp[n]!=-1) {
  // return dp[n];
  // }
  // dp[n]= arr[n]+ Math.min(Helper(arr,n-1,dp),Helper(arr,n-2,dp));
  // return dp[n];
  // }

  // Tabulation
  // static int Helper(int[] arr, int n, int[] dp) {
  //   dp[0] = arr[0];
  //   dp[1] = arr[1];

  //   for (int i = 2; i < n; i++) {
  //     dp[i] = arr[i] + Math.min(dp[i - 1], dp[i - 2]);
  //   }
  //   return Math.min(dp[n - 1], dp[n - 2]);
  // }

  //Space Optimization;
  static int Helper(int[] arr, int n) {
  int prev1=arr[0];
  int prev2=arr[1];
   
    for (int i = 2; i < n; i++) {
      int curr=arr[i]+Math.min(prev1, prev2);
      prev1=prev2;
      prev2=curr;
    }
    return Math.min(prev1,prev2);
  }

}
