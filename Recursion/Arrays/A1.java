import java.util.ArrayList;

public class A1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 4, 4, 5, 4 };
        // System.out.println(sorted(arr, 0));
        // System.out.println(LsearchIndex(arr, 4, 0));
        // ArrayList<Integer> list = new ArrayList<>();
        // System.out.println(FindAllIndex(arr, 4, 0, list));
        System.out.println(AddAllIndex(arr, 4, 0));

    }

    // check if sorted or not;
    static boolean sorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i + 1] && sorted(arr, i + 1);
    }

    // LinerSearch Using Recurssion;
    static boolean Lsearch(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        }
        return arr[i] == target || Lsearch(arr, target, i + 1);
    }

    // LinerSearch index of target element
    static int LsearchIndex(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        } else {
            return LsearchIndex(arr, target, i + 1);
        }
    }

    // Add all index of target element in list
    static ArrayList<Integer> FindAllIndex(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        return FindAllIndex(arr, target, i + 1, list);

    }

    // Add all index of target element in list(creating new list at every function
    // call)
    static ArrayList<Integer> AddAllIndex(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> downlist = AddAllIndex(arr, target, i + 1);
        list.addAll(downlist);// adding the list from below recursive calls to the present list in current // recursion call
        return list;

    }
}