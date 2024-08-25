public class P24 {
    public static void main(String[] args) {
        int n = 20;
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        //     sum += i;

        // }
        int sum=naturalSum(n);
        System.out.println(sum);
    }

   static int naturalSum(int n){
        if(n==0){
            return 0;
        }

        return n+naturalSum(n-1);
    }
}
