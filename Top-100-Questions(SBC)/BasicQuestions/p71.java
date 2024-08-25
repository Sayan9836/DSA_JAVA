import java.util.*;

public class p71 {
    public static void main(String[] args) {
        int[] arr={1, 5, 15, 10};
        int k=3;
        Arrays.sort(arr);
        int diff=arr[arr.length-1]-arr[0];
        int max,min;
        for (int i = 1; i < arr.length; i++) {
             max=Math.max(arr[arr.length-1]-k,arr[i-1]+k);
             min=Math.min(arr[0]+k,arr[i]-k);
             diff=Math.min(diff, max-min);
        }

        System.out.println(diff);
    }
}