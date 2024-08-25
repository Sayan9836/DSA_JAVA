public class permutation {
    public static void generetepermutation(String str, int start, int end) {
        if (start == end - 1) {
            System.out.println(str);
        } else {
            for (int i = start; i < end; i++) {
                str = swap(str, start, i);// swaping
                generetepermutation(str, start + 1, end);// recursively calling function
                str = swap(str, start, i);// backtracking
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);

    }

    public static void main(String[] args) {
        String str = "ABC";
        generetepermutation(str, 0, str.length());
    }
}
