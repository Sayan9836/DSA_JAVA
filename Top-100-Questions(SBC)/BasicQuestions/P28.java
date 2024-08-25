public class P28 {
    public static void main(String[] args) {
        int ans=GCD(10,40);
        System.out.println(ans);
    }

    static int GCD(int a,int b){
        if (b==0) {
            return a;
        }
        
        return GCD(b,a%b);
    }
}
