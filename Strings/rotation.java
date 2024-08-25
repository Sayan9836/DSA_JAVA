import java.util.Arrays;

public class rotation {
    public static void main(String[] args) {
        String str = "abcde";
        String str1 = "debkc";
        char[] a = str.toCharArray();
        char[] b = str1.toCharArray();
        if (a.length != b.length) {
            System.out.println("not a rotation");
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            System.out.println("rotation");
        }
        else{
            System.out.println("not rotation");
        }

    }
}
