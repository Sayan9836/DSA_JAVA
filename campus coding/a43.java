import java.util.*;

public class a43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.split(" ");

        String ans = "";
        for (String word : words) {
            String reverse = reversed(word);
            ans = ans + " " +reverse;
        }

        System.out.println(ans.substring(1,ans.length()));
    }


    static String reversed (String str){
        String ans = "";

        for(int i=0;i<str.length();i++){
            ans = str.charAt(i) + ans;
        }

        return ans;
    }
}
