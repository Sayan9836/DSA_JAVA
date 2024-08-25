import java.util.ArrayList;

public class P57 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ab";
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        subsequence("", str1, list);
        subsequence("", str2, list2);
        for (String str : list) {
            if (list2.contains(str)) {
                System.out.print(str + " ");
            }
        }
    }

    static void subsequence(String up, String p, ArrayList<String> list) {
        if (p.isEmpty()) {
            list.add(up);
            return;
        }
        char ch = p.charAt(0);
        subsequence(up + ch, p.substring(1), list);
        subsequence(up, p.substring(1), list);
    }
}

