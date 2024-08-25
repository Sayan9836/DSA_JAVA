public class P41 {
    public static void main(String[] args) {
        
        int n=14;
        for(int i=2;i<=n/2;i++){
            if(isPrime(i)){
                if (isPrime(n-i)) {
                    System.out.println(i+"+"+(n-i));
                }
            }
        }

    }


                                
    static boolean isPrime(int n){
         for(int i=2;i*i<=n;i++){
          if(n%i==0){
            return false;
          }
         }
         return true;
    }
}
                               
