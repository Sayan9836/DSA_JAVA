public class frequency {
    public static void main(String[] args) {
        String str = "ancfyjzoazjfma";
        char[] b = str.toCharArray();
        for (int i = 0; i < b.length; i++) {
            int count = 1;

            for (int j = i + 1; j < b.length; j++) {
                if (b[i] == b[j]) {
                    count++;

                    b[j] = 0;
                }

            }
            if (count >= 1 && b[i] != 0) {
                System.out.print(b[i] + " ");
                System.out.println(count);
            }
        }
    }
}
