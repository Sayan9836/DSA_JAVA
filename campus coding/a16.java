import java.util.*;
public class a16 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      
      int ans = str.charAt(0) - '0';
      for(int i=0;i<str.length()-1;i++){
        char ch = str.charAt(i);
        char nextCh = str.charAt(i+1);
        if (ch == 'A') {
            ans= ans & (nextCh - '0');
        }else if(ch == 'B'){
            ans = ans | (nextCh - '0');
        }else if(ch == 'C'){
            ans = ans^ (nextCh -'0');
        }
      }
      System.out.println(ans);
    }
}
