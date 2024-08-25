public class P18 {
    public static void main(String[] args) {
        int n=11224;
        int sum=0;
        while (n>0) {
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
