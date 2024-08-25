public class M5 {
    // to find no of digits in any number system;
    public static void main(String[] args) {
        int n=17;
        int b=2;
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}
