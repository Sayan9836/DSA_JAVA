public class P5 {
    public static void main(String[] args) {
        int n=7;
        if (square(n)%10==n) {
         System.out.println("Automorphic Number");   
        }else{
         System.out.println("Not a Automorphic Number");
        }
    }

   static int square(int n){
        return n*n;
    }
}
 
