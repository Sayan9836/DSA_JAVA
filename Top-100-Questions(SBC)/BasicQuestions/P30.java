public class P30 {
    public static void main(String[] args) {
        int n=512;
        int sum=0;
        int inc=0;
        while(n>0){
            int temp=n%10;
            sum+=Math.pow(8, inc++)*temp;
            n/=10;
        }
        System.out.println("Decimal no is: "+sum);
    }
}
