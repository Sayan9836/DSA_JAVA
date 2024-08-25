
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class negetive {
    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;
        System.out.println(Arrays.toString(box(arr, k)));
    }

    static int[] box(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        int start = 0;
        int end = 0;
        int[] result = new int[arr.length - k + 1];
        int idx = 0;
        while (end < arr.length) {
            if (arr[end] < 0) {
                q.add(arr[end]);
            }
            if (end - start + 1 == k) {
                if (q.size() == 0) {
                    result[idx++] = 0;
                } else {
                    result[idx++] = q.peek();
                    if (arr[start] == q.peek()) {
                        q.poll();
                    }
                }
                start++;
            }
            end++;
        }
        return result;
    }
}
