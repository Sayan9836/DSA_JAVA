public class P2 {
    public static void main(String[] args) {
        int n1=6,n2=12;
        if ((Sumoffactor(n1)/n1)==(Sumoffactor(n2)/n2)) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

   static int Sumoffactor(int n){
        int ans=0;
    for(int i=2;i*i<=n;i++){
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
