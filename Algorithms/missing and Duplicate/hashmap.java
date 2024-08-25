
import java.util.HashSet;

public class hashmap {
    public static void main(String[] args) {
        int[] arr = { 5, 5, 5, 5, 5, 7, 8, 9, 2, 7, 7};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : arr) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                set2.add(i);
            }
        }
        System.out.println(set2);
    }
}
