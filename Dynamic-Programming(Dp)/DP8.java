public class DP8 {

// painting fench not more than 2 adjacent can have same color 
    public static void main(String[] args) {
        int ans=solve(5, 3);
        System.out.println(ans);
    }

    public static int solve(int n,int k){
        if (n==1) {
            return k;
        }
        if (n==2) {
           return k+k*(k-1);
        }

        return (solve(n-2,k)*(k-1))+(solve(n-1,k)*(k-1));
    }

      public static int solve1(int n,int k){
        int same=k*1;
        int different=k*(k-1);
        int total=same+different;
        for (int i=3;i<=n;i++) {
            same=different*1;
            different=total*(k-1);
            total=same+different;
        }
        return total;
    }
}
