import java.util.*;

public class a9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
        
            if (Character.isLetter(ch)) {
                int val = (int)ch;
                if(val>96 && val + n > 122){
                    val = val + n - 122 + 96;
                    ch = (char)val;
                }else if (val < 91 && val + n > 90){
                    val = val + n - 90 + 64;
                    ch = (char)val;
                }else{
                  ch+=n;
                }
            }
            ans += ch;
        }
        System.out.println("The encrypted Text is: " + ans);
    }
}
