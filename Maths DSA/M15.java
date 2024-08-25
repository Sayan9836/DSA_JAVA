public class M15 {
    // square root of any number
    public static void main(String[] args) {
        int n = 12;
        int p = 3;

        System.out.printf("%.3f", sqrt(n, p));
    }

    private static double sqrt(int n, int p) {
        int start = 0;
        int end = n;

        double root = 0.0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
                root = mid;
            }
        }

        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += increment;
            }
            root -= increment;
            increment = increment / 10;// when loop is running for the next decimal place
        }

        return root;
    }
}
