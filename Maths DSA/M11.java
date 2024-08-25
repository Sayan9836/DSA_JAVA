public class M11 {
    // X-OR between a given range from a to b;
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int ans = xor(b) ^ xor(a - 1);
        System.out.println(ans);
    }

    // x-0R from 0 to a
    static int xor(int a) {
        int result = -1;
        if (a % 4 == 0) {
            result = a;
        } else if (a % 4 == 1) {
            result = 1;
        } else if (a % 4 == 2) {
            result = a + 1;
        } else if (a % 4 == 3) {
            result = 0;
        }
        return result;
    }
}
