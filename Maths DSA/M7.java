public class M7 {
    // to check wheather a no is a power of 2 or not;
    public static void main(String[] args) {
        int n = 4;
        if (n == 0) {
            System.out.println("not a power of 2");
        }
        if ((n & (n - 1)) == 0) {
            System.out.println("power of 2");
        } else {
            System.out.println("not a power of 2");
        }
    }
}
