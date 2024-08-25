import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "dbca";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anamgram");
        } else {

            char[] str1 = s1.toCharArray();
            char[] str2 = s2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);

            if (Arrays.equals(str1, str2)) {
                System.out.println("Anamgram");
            } else {
                System.out.println("Not Anamgram");
            }
        }

    }
}
