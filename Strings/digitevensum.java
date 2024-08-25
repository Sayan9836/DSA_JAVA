public class digitevensum {
    public static void main(String[] args) {
        int digit, rev;
        int n;
        for (n = 100; n <= 200; n++) {
            rev = n;
            int sum=0;
            while (n != 0) {
                digit = n % 10;
                sum += digit;
                n = n / 10;
            }
            if (sum % 2 == 0) {
                System.out.println(rev);
            }
            n = rev;
            

        }
    }
}