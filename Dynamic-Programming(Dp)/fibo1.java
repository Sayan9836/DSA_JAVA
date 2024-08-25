import java.util.Arrays;

public class fibo1{
    public static void main(String[] args) {
        int n=6;
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fibonacci1(n,dp));
        System.out.println(fibonacci2(n,dp));
        System.out.println(fibonacci3(0));
    }

    // memoization
    static int fibonacci1(int n,int[] dp){
        if (n<=1) {
            return n;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }

        dp[n]=fibonacci1(n-1,dp)+fibonacci1(n-2,dp);
        return dp[n];
    }

   // tabulation method
    static int fibonacci2(int n,int[] dp){
    dp[0]=0;
    dp[1]=1;

    for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
    }

    //space Optimisation
    static int fibonacci3(int n){
      int prev1=0;
      int prev2=1;
      int curr=0;

        for(int i=2;i<=n;i++){
             curr= prev1+prev2;
             prev1=prev2;
             prev2=curr;

        }
        return curr;
    }

}