import java.util.*;

public class a20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = 1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (j<n) {
            min = Math.min(min, arr[j]);
            max = Math.max(max, arr[i]);
            i+=2;
            j+=2;
        }
        int prevMax = max;
        int prevMin = min;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        i=0;
        j=1;
        while (j<n) {
            if (arr[j]!= prevMin) {
                min = Math.min(min, arr[j]);
            }
            if (arr[i] != prevMax) {
                max = Math.max(max, arr[i]);
            }
            i+=2;
            j+=2;
        }
        System.out.println(max+" "+min);
        System.out.println(max+min);
    }
}
