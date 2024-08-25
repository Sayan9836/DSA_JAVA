public class M9 {
    // to count the no of setbit
    public static void main(String[] args) {
        int n = 67;
        int count = 0;
        // while (n > 0) {
        // if ((n & 1) == 1) {
        // count++;
        // }
        // n = n >> 1;
        // }

        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        System.out.println(count);
    }
}
