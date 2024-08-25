
import java.util.Arrays;

public class threeSum {
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,9,12};
        //Arrays.sort(arr);
        int target = 24;
        System.out.println(Arrays.toString(targetSum(arr, target)));
    }

    static int[] targetSum(int[] arr, int target) {
        int[] newarr = new int[3];
        for (int i = 0; i < arr.length-2; i++) {
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int currsum = arr[i] + arr[start] + arr[end];
                if (currsum == target) {
                    newarr[0] = i;
                    newarr[1] = start;
                    newarr[2] = end;
                    break;
                }
                if (currsum < target) {
                    start += 1;
                }
                if (currsum > target) {
                    end -= 1;
                }
            }
        }
        return newarr;
    }
}
