import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 2, 7, 3 };
        MergeSort1(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void MergeSort1(int[] arr, int l, int r) {

        if (l < r) {
            int mid = l + (r - l) / 2;

            MergeSort1(arr, l, mid);
            MergeSort1(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; ++i)
            arr1[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            arr2[j] = arr[mid + 1 + j];

        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}