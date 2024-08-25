public class sayan {
    public static void main(String[] args) {
        System.out.println(reverse(321));
    }

    static int reverse(int n) {
        int sum = 0;
        if (n % 10 == n) {
            return n;
        } else {
            n = n % 10;
            sum = (sum * 10) + n;
            n = n / 10;

        }
        return sum;
    }
}