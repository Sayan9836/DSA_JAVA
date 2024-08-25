import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 3, 4, 2,7,6, 1 };
        arr = sorting(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sorting(int[] arr, int low, int high) {

        if (low >= high) {
            return arr;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // pivot is at correct index,sort the two halves;

        arr = sorting(arr, low, end);
        arr = sorting(arr, start, high);

        return arr;

    }
}
