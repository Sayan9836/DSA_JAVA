
public class reversestr {
    public static void main(String[] args) {
        String str = "sayan";
        /*
         * / char[] b = str.toCharArray();
         * int start = 0;
         * int end = b.length - 1;
         * while (start < end) {
         * char temp = b[start];
         * b[start] = b[end];
         * b[end] = temp;
         * start++;
         * end--;
         * 
         * }
         * System.out.println(Arrays.toString(b));
         */
        System.out.println(str);
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
