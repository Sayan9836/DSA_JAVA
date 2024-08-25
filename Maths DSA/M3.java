public class M3 {

    // find the ith bit of a binary no:
    public static void main(String[] args) {
        int num = 15;

        // i is the required bit position
        int n = 2;

        int mask = 1 << n;

        int result = num & mask;
        System.out.println(result);
    }
}
