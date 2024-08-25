import java.util.Arrays;

public class DP7 {
    public static void main(String[] args) {
        int n=8;
        int[] arr=new int[8];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int MOD=100000007;
        int ans=countDearrangement(n,arr,dp,MOD);
        System.out.println(ans);
    }

    public static int countDearrangement(int n,int[] arr,int[] dp,int MOD){
        if(n==1){
            return 0;
        }
        if (n==2) {
            return 1;
        }

        if (dp[n]!=-1) {
            return dp[n];
        }

        dp[n]=((n-1)*((countDearrangement(n-1,arr,dp,MOD))%MOD+(countDearrangement(n-2, arr, dp,MOD))%MOD))%MOD;
        return dp[n];
    }


    
}
