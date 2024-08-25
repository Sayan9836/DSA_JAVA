import java.util.Arrays;

public class p65 {
    public static void main(String[] args) {
        String s = "abcda";
        String s1 = "cbaad";

        char[] ch1 = s.toCharArray();
        char[] ch2 = s1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
