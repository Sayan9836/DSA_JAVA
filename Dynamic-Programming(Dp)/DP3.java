import java.util.Arrays;

public class DP3 {
    // Minimum no of coins (with how many no of coins we can get our target)
    public static void main(String[] args) {
    int[] arr={2};
    int target=7 ;
    int[] dp=new int[target+1];
    Arrays.fill(dp, Integer.MAX_VALUE);
    int ans=solve2(arr,target,dp);

    //  if (ans==Integer.MAX_VALUE) {
    //     System.out.println("-1");
    //  }else{
    //     System.out.println(ans);
    //  }
     System.out.println(ans);
    }

    //Recurrsive approach
    // private static int solve(int[] arr, int target) {

    //     if(target==0){
    //         return 0;
    //     }

    //     if(target<0){
    //        return Integer.MAX_VALUE;
    //     }
          
    //       int mini=Integer.MAX_VALUE;
    //     for(int a:arr){
    //         int ans=solve(arr, target-a);
    //         if (ans!=Integer.MAX_VALUE) {
    //             mini=Math.min(mini,1+ans);
    //         }
    //     }
    //     return mini;
    // }

    // Memoization
    private static int solve(int[] arr, int target,int[] dp) {
            
        if(target==0){
            return 0;
        }

        if(target<0){
           return Integer.MAX_VALUE;
        }
        if (dp[target]!=-1) {
            return dp[target];
        }
          
            int mini=Integer.MAX_VALUE;
            for(int a:arr){
            int ans=solve(arr, target-a,dp);
            if (ans!=Integer.MAX_VALUE) {
                mini=Math.min(mini,1+ans);
            }

          }
        dp[target]=mini;
        return dp[target];
    }

    //tabulation
    private static int solve2(int[] arr, int target,int[] dp) {
        dp[0]=0;
                        
        for(int i=1;i<=target;i++){
                                
           for(int j=0;j<arr.length;j++){
                if(i-arr[j]>=0&&dp[i-arr[j]]!=Integer.MAX_VALUE){
                 dp[i]=Math.min(dp[i],1+dp[i-arr[j]]);
                }
            }
        }

        if (dp[target]==Integer.MAX_VALUE) {
            return -1;
        }

        return dp[target];
    }

}
