public class M2 {

    // find the unique element in the array
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 4, 2, 6, 4 };
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
