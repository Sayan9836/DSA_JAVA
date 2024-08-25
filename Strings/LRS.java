public class LRS {
    public static void main(String[] args) {
        String s = "acbdfghybdf";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.print(s.charAt(i));

                }
            }
        }

    }
}
