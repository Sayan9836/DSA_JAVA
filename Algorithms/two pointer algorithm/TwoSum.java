
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(findSum(arr, target)));
    }

    static int[] findSum(int[] arr, int target) {
        Arrays.sort(arr);
        int[] newarr = new int[2];
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int currsum = arr[start] + arr[end];

            if (currsum == target) {
                newarr[0] = start;
                newarr[1] = end;
            }

            if (currsum < target) {
                start++;
            } else {
                end--;
            }
        }
        return newarr;
    }
}
