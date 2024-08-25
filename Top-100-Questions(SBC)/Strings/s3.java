import java.util.*;
public class s3 {    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str  = sc.next();

       String vowel = "aeiouAEIOU";
       StringBuilder sb = new StringBuilder();

       for ( char ch : str.toCharArray()) {
          if(!vowel.contains(Character.toString(ch))){
            sb.append(ch);
          }
       }

       System.out.println(sb.toString());

    }
}
