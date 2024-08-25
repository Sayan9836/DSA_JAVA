public class P34 {
    public static void main(String[] args) {
        int n=2545;
        String hex="0123456789ABCDEF";
        String ans="";
        while (n>=1) {
            int rem=n%16;
            ans+=hex.charAt(rem);
             n/=16;
        }
        for(int i=ans.length()-1;i>=0;i--){
            System.out.print(ans.charAt(i));
        }
    }
}
