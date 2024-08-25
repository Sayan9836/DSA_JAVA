import java.util.Arrays;

// present in circular manner
public class DP5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int n=arr.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        int ans=solver(arr,n,dp);
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

    private static int solver(int[] arr,int n,int[] dp) {
        int[] firstArr=new int[n-1];
        int[] secondArr=new int[n-1];
        if (n==1) {
            return arr[0];
        }
        for(int i=0;i<n;i++){
            if(i!=0){
                firstArr[i-1]=arr[i];
            }
            if(i!=n-1){
                secondArr[i]=arr[i];
            }
        }

        return Math.max(solve(secondArr, n-2, dp), solve(firstArr, n-2, dp));
    }
    
}
