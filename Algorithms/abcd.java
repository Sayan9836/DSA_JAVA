
// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.HashSet;

public class abcd {
    public static void main(String[] args) {
        int[] arr = { -25, 38, 24, -17, 7, 31, 43, 8, 20, 49, -33, -11, 19, 13, -28, 44, 23, -3, -19, 12, 32, 40, 42,
                41, 7, -35, -29, 7, 24, 41, -3, 1, -19, -29, -13, -10, 4, -20, 48 };
        // Arrays.sort(arr);
        System.out.println(missingNumber(arr, 39));
    }

    static int missingNumber(int arr[], int size) {
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // if(size==1){
        // return 1;
        // }
        int p = 0;
        while (arr[p] < 0) {
            p++;
        }
        if (arr[p] != 0 && arr[p] != 1) {
            return 1;
        }
        // HashSet<Integer> set = new HashSet<>();
        for (int i = p; i < size; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                return arr[i] + 1;
            }
            // set.add(arr[i]);
        }
        // ArrayList<Integer> list = new ArrayList<>(set);
        // for (int i = 0; i < list.size() - 1; i++) {
        // if (list.get(i + 1) != list.get(i) + 1) {
        // return list.get(i) + 1;
        // }
        return arr[size - 1] + 1;
    }

}
