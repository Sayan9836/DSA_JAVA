import java.util.Arrays;

// non-adjacent sum
public class DP4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,9};
        int n=arr.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        // int ans=solve(arr,n-1,dp);
        int ans=solve(arr,n-1,dp);
        System.out.println(ans);
    }

    private static int solve(int[] arr,int n,int[] dp) {
        if (n<0) {
            return 0;
        }
        if (n==0) {
            return arr[0];
        }

        if (dp[n]!=-1) {
            return dp[n];
        }
        int incl=solve(arr, n-2, dp)+arr[n];
        int nincl=solve(arr, n-1, dp)+0;

        dp[n]=Math.max(incl,nincl);
        return dp[n];
    }

    //////// Tabulation method ///////////////////////////

    // private static int solve1(int[] arr,int n,int[] dp) {
    //     dp[0]=arr[0];
    //     for (int i = 1; i<n+1; i++) {
    //         int incl=dp[i-2]+arr[i];
    //         int nincl=dp[i-1]+0;
    //         dp[i]=Math.max(incl,nincl);
    //     }

    //     return dp[n];
    // }
}
