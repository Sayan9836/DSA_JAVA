
public class prob1arrReverse {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5 };
        reverse(arr, arr.length);

    }

    static void reverse(int[] arr, int n) {
        int temp, k;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for (k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }

    }

}
