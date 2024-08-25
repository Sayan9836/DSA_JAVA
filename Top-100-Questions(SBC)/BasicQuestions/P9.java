public class P9{
    public static void main(String[] args) {
        int n=49;

        // for(int i=2;i*i<=n;i++){
        //    if (n%i==0) {
        //       if (n/i==i) {
        //         if(isPrime(i)){
        //             System.out.println(i);
        //         }
        //       }else{
        //         if(isPrime(i)&&isPrime(n/i)){
        //             System.out.println(i+n/i);
        //         }else if(isPrime(i)){
        //         System.out.println(i);
        //         }else if(isPrime(n/i)){
        //            System.out.println(n/i);
        //         }
        //       }
        //    }
        // }

        for (int i = 2; i*i<=n ; i++) {
            while (n%i==0) {
                n/=i;
                System.out.println(i);
            }
        }
                                                    
        if (n!=1) {
            System.out.println(n);
        }
                                                     
    }

    // static boolean isPrime(int n){
    //    for(int i=2;i*i<=n;i++){
    //     if (n%i==0) {
    //         return false;
    //     }
    //    }
    //    return true;
    // }
}