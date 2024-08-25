import java.util.*;

public class mock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    System.out.println(ans);
                    ans = "";
                    ans += Character.toLowerCase(ch);
                } else {
                    ans += Character.toUpperCase(ch);
                }
            }
        }

        System.out.println(ans);
    }
}
