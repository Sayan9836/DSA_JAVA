import java.util.ArrayList;

public class S2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        // subseq("", "abc");
        subseq("", "abc", list);
        System.out.println(list);

        // int arr[] = { 1, 2,3,4};
        // System.out.println(subset(arr));
        // permutation("", "abc");

    }

    // static void subseq(String ans, String str) {

    //     if (str.isEmpty()) {
    //         System.out.println(ans);
    //         return;
    //     }

    //     char ch = str.charAt(0);

    //     subseq(ans + ch, str.substring(1));
    //     subseq(ans, str.substring(1));
    // }

    // ************************************************************************ */

    // static ArrayList<String> subseq(String ans, String str) {

    // if (str.isEmpty()) {
    // ArrayList<String> list = new ArrayList<>();
    // list.add(ans);
    // return list;

    // }

    // char ch = str.charAt(0);

    // ArrayList<String> left = subseq(ans + ch, str.substring(1));
    // ArrayList<String> right = subseq(ans, str.substring(1));

    // left.addAll(right);
    // return left;
    // }

    // ************************************************************************* */

    static void subseq(String ans, String str, ArrayList<String> list) {

    if (str.isEmpty()) {
    list.add(ans);
    return;
    }

    char ch = str.charAt(0);

    subseq(ans + ch, str.substring(1), list);
    subseq(ans + (ch+0), str.substring(1), list);
    subseq(ans, str.substring(1), list);
    }

    static ArrayList<ArrayList<Integer>> subset(int[] arr) {
    ArrayList<ArrayList<Integer>> Outer = new ArrayList<>();

    Outer.add(new ArrayList<>());

    for (int num : arr) {
    int n = Outer.size();
    for (int i = 0; i < n; i++) {
    ArrayList<Integer> innerlist = new ArrayList<>(Outer.get(i));
    innerlist.add(num);
    Outer.add(innerlist);
    // Outer.get(i).add(num);
    }
    }
    return Outer;
    }

    // to find subset when dupliate elements are present

    // static ArrayList<ArrayList<Integer>> subset(int[] arr) {
    // ArrayList<ArrayList<Integer>> Outer = new ArrayList<>();

    // Outer.add(new ArrayList<>());
    // int end = 0;
    // for (int i = 0; i < arr.length; i++) {
    // int start = 0;
    // if (i > 0 && arr[i] == arr[i - 1]) {
    // start = end + 1;// or start=n;
    // }
    // end = Outer.size() - 1;
    // int n = Outer.size();
    // for (int j = start; j < n; j++) {
    // ArrayList<Integer> innerlist = new ArrayList<>(Outer.get(j));
    // innerlist.add(arr[i]);
    // Outer.add(innerlist);
    // // Outer.get(i).add(num);
    // }
    // }
    // return Outer;
    // }

    // permutations of a string
    // static void permutation(String ans, String str) {

    // if (str.isEmpty()) {
    // System.out.println(ans);
    // return;
    // }

    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);
    // String left = str.substring(0, i);
    // String right = str.substring(i + 1);
    // String remaining = left + right;
    // permutation(ans + ch, remaining);

    // }

    // }

}
