import java.util.*;
import java.util.HashSet;

public class p69 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 4, 5 };
        int[] arr2 = { 1, 6, 3,3,3, 9 };
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int ele : arr1) {
            set.add(ele);
        }
        for (int i : arr2) {
            if (!set.contains(i)) {
                set.add(i);
            }else{
                if(!list.contains(i)){
                    list.add(i);
                }
            }
        }
        System.out.println(list);
        System.out.print(set);
    }
}
