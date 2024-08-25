public class NCR {
    public static void main(String[] args) {
        int n = 4;
        int r = 2;
        int fact = 1;
        int fact1 = 1;
        int fact2 = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        for (int j = 1; j <= r; j++) {
            fact1 = fact1 * j;

        }
        for (int k = 1; k <= (n - r); k++) {
            fact2 = fact2 * k;
        }

        int factorial = fact / (fact1 * fact2);
        System.out.println(factorial);

    }
}
