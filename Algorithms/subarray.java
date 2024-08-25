import java.util.HashMap;

public class subarray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 1, 2 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] != a[i + 1])
                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (int element : a) {
            max = Math.max(max, map.get(element));
        }
        System.out.println(max);

    }
}
