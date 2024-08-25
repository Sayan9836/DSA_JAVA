
public class Swapsort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 5 };
        sort(arr);
    }

    static void sort(int[] arr) {
        int i = 0;
        // int[] missing = new int[arr.length];
        // int[] duplicate = new int[arr.length];
        // int k = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr[i], arr[arr[i] - 1]);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                // missing[k] = i + 1;
                // duplicate[k] = arr[i];
                // k++;
                System.out.print("missing:" + j + 1);
                System.out.print("duplicate" + arr[j]);
            }
        }

    }

    private static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }

}
