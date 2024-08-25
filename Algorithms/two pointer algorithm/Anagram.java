import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String text = "forxxorfxdofr";
        String word = "for";
        System.out.println(CountOccurences(word, text));
    }

    static int CountOccurences(String w, String s) {
        int Character = 256;
        int wl = w.length();
        int sl = s.length();
        int count = 0;
        char[] wArr = new char[Character];
        char[] sArr = new char[Character];
        if (wl <= 0 || sl <= 0 || sl < wl) {
            return 0;
        }
        int i = 0;
        // for the starting window
        for (; i < wl; i++) {
            wArr[Character - w.charAt(i)]++;
            sArr[Character - s.charAt(i)]++;
        }
        if (Arrays.equals(wArr, sArr)) {
            count += 1;
        }
        // for next window
        for (; i < sl; i++) {
            sArr[Character - s.charAt(i)]++;
            sArr[Character - s.charAt(i - wl)]--;
            if (Arrays.equals(wArr, sArr)) {
                count += 1;
            }
        }
        return count;

    }
}