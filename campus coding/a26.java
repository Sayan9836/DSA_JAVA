import java.util.*;

public class a26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                cnt++;
            }
        }

        str=str.replaceAll("-", "");
        String hipen="";
        for(int i=0;i<cnt;i++){
            hipen+='-';
        }
        str=hipen+str;

        System.out.println(str);

    }
}
