public class M17 {
    // fators of a no;
    public static void main(String[] args) {
        // factors1(20);
        factors2(36);
    }

    // O(n)
    // private static void factors1(int n) {
    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0) {
    // System.out.print(i + " ");
    // }
    // }
    // }

    // O(sqrt(n))
    private static void factors2(int n) {
        int count=0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    // System.out.print(i + " ");
                    count++;
                    continue;
                }
                count+=2;
                // System.out.print(i + " " + n / i + " ");
            }
        }
        System.out.println(count);
    }

}
