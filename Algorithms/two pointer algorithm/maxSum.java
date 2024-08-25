//import java.util.HashMap;

public class maxSum {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int sum = 15;
        System.out.println(largestSubarray(arr, sum));
    }

    static int largestSubarray(int[] arr, int sum) {
        int start = 0;
        int end = 0;
        int currSum = 0;
        int max = 0;
        int size = 0;
        while (end < arr.length) {
            currSum += arr[end];

            if (currSum == sum) {
                size = end - start + 1;
                max = Math.max(max, size);

            }

            if (currSum > sum) {
                while (currSum > sum) {
                    currSum = currSum - arr[start];
                    start += 1;
                }
            }
            end++;
        }
        return max;

        // HashMap<Integer, Integer> map = new HashMap<>();
        // int maxlen = 0;
        // int sum2 = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum2 += arr[i];

        // if (sum2 == sum) {
        // maxlen = i + 1;
        // }

        // if (!map.containsValue(sum2)) {
        // map.put(sum2, i);
        // }

        // if (map.containsKey(sum2 - sum)) {
        // maxlen = Math.max(maxlen, (i - map.get(sum2 - sum)));
        // }
        // }
        // return maxlen;
    }
}
