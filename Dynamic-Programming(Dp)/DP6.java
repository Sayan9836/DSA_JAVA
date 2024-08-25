public class DP6 {
    public static void main(String[] args) {
        int x=3,y=4,z=3;
        int n=8;
        int ans=solve(n,x,y,z);
        System.out.println(ans);
    }

    private static int solve(int n,int x, int y, int z) {

        if (n==0) {
            return 0;
        }
        if (n<0) {
            return Integer.MIN_VALUE;
        }
        int a=solve(n-x,x,y,z)+1;
        int b=solve(n-y, x, y, z)+1;
        int c=solve(n-z, x, y, z)+1;
        return Math.max(a, Math.max(b, c));
    }
}
