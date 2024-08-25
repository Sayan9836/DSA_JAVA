public class P3 {
    public static void main(String[] args) {
        int n=6;
        if (sumofFactor(n)>n) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    static int sumofFactor(int n){
        int ans=0;
        for (int i=2; i*i<=n; i++) {
            if (n%i==0) {
                if (n/i==i) {
                    ans+=i;
                }else{
                    ans+=i+n/i;
                }
            }
        }
        return ans+1;
    }
}
