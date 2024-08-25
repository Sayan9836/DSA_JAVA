public class P39 {
   public static void main(String[] args){
    int n1=1;
    int d1=3;
    int n2=3;
    int d2=9;
    int numerator=(n1*d2)+(n2*d1);
    int denominator=d1*d2;
     int gcd=GCD(numerator,denominator);

     int fn=numerator/gcd;
     int fd=denominator/gcd;

     System.out.println("ans"+"="+"("+fn+"/"+fd+")");
   }

   static int GCD(int n,int d){
    if(d==0){
        return n;
    }

     return GCD(d,n%d);
   }

}
