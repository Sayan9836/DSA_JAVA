public class P12 {
    public static void main(String[] args) {
        int n=4;
        int[] dp=new int[n+1];
        // int fact=1;
        // for(int i=2;i<=n;i++){
        //     fact*=i;
        // }
        int ans=facto(n,dp);
        System.out.println(ans);
    }

   static int facto(int n,int[] dp){
         if (n==1) {
            return 1;
         }
         if (dp[n]!=0) {
            return dp[n];
         }
        return dp[n]=n*facto(n-1,dp);
    }
}


