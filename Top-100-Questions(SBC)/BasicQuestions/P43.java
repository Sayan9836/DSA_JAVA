public class P43 {
    public static void main(String[] args) {
        int n=1733;
        int cnt=0;
        while (n>0) {
            n/=10;
            cnt++;
        }

        System.out.println(cnt);
    }
}
