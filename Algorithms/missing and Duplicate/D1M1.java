import java.util.Arrays;

public class D1M1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 5 };
        int n = 5;
        System.out.println(Arrays.toString(DM(arr, n)));
    }

    static int[] DM(int[] arr, int n) {
        int sum = 0;
        int sum2 = 0;
        for (int a : arr) {
            sum += a;
            sum2 += (a * a);
        }
        int k = ((n * (n + 1)) / 2) - sum;
        int b = ((n * (n + 1) * ((2 * n) + 1)) / 6) - sum2;
        int c = b / k;
        int missing = (k + c) / 2;
        int duplicate = c - missing;

        return new int[] { duplicate, missing };

    }

}