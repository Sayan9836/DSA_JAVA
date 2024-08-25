import java.util.Scanner;

public class s6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] words = input.split(" ");
        String ans = "";
        for(String word : words) {

           char start =  Character.toUpperCase(word.charAt(0));
           char end = Character.toUpperCase(word.charAt(word.length() - 1));

           String remaining = "";
           if (word.length() > 2) {
            remaining = word.substring(1,word.length() - 1);
           }

           String currWord = start + remaining + end;

           if (word.length() == 1) {
            currWord =  currWord.substring(1);
           }

           ans+=currWord + " ";

        }

        System.out.println(ans);
    }
}
