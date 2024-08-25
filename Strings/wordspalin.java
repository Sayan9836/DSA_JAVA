public class wordspalin {
    public static void main(String[] args) {
        int count = 0;
        String str = "wow you aaa kayak";
        String[] word = str.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (ispalin(word[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean ispalin(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
