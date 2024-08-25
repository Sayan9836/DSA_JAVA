public class P11 {
    public static void main(String[] args) {
        // int n=5;
        // int power=4;
        // int i=0;
        // int ans=n;
        // while (i<power-1) {
        //     ans=ans*n;
        //     i++;
        // }
        // System.out.println(ans);
       int ans= powerNo(2,3);
       System.out.println(ans);
    }

   static int powerNo(int n,int power){
        if (power==0) {
            return 1;
        }
        return n*powerNo(n, power-1);
    }
}
