public class P8 {
    public static void main(String[] args) {
        int n=199;
        int[] dp=new int[n+1];
        if (SumofFactorial(n,dp)==n) {
            System.out.println("Yes,it's a strong number");
        }else{
            System.out.println("No,it's not a strong number");
        }
    }

    static  int SumofFactorial(int n,int[] dp){
        int sum=0;
        while (n>0) {
            sum+=factorial(n%10,dp);
            n/=10;
        }
        return sum;
    }

    static int factorial(int n,int[] dp){
        //   int fact=1;
        // for (int i = 1; i <=n; i++) {
        //     fact*=i;
        // }
        // return fact;
        if (n==0) {
            return 1;
        }
        if (dp[n]!=0) {
            return dp[n];
        }
    return  dp[n]=n*factorial(n-1,dp);
    }
}
