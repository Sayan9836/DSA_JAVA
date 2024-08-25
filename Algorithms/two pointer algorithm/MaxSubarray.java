
public class MaxSubarray {

    public static void main(String[] args) {

        int[] arr = { 10, 9, 8, 7, 5, 4, 3, 2, 1 };
        int k = 4;
        System.out.print(subaaray(arr, k));
    }
    
     
    static int subaaray(int arr[], int k) {
        int start = 0;
        int end = 0;
        int windowSum = 0;
        int maxsum = 0;
        
        // while (end < k) {
        //     windowSum += arr[end++];
        // }

        // while (end < arr.length) {
        //     maxsum = Math.max(maxsum, windowSum);
        //     windowSum += arr[end++] - arr[start++];
        // }
        // return maxsum;
        while(end<arr.length){
            windowSum+=arr[end];
            if (end-start+1==k) {
                maxsum=Math.max(maxsum, windowSum);
            }

            if (end-start+1>k) {
                windowSum-=arr[start];
                start++;
            }
            end++;
        }
        return maxsum;
    }

}
