public class M16 {
    // newton method for square root
    public static void main(String[] args) {
        System.out.printf("%.3f", sqrt(4));
    }

    static double sqrt(double n) {
        double x = n;
        double root = 0.0;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.2) {
                break;
            }
            x = root;
        }

        return root;
    }
}
