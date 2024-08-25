import java.util.*;
public class a40 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();

    int i=0;
    int j=0;
    String first = "";
    String second = "";
    while(i<str1.length() && j<str2.length()){
        char ch1 = str1.charAt(i);
        char ch2 = str2.charAt(j);

        if(ch1-'0' < ch2 - '0'){
            first+=ch1;
            second=ch2+second;
        }else if(ch1 - '0' > ch2 - '0'){
            first+=ch2;
            second=ch1+second;
        }
        i++;
        j++;
    }

    while(i<str1.length()){
        first+=str1.charAt(i);
        i++;
    }

    while(j<str2.length()){
        first+=str2.charAt(j);
        j++;
    }

    String ans = first + second;
    System.out.println(ans);
   } 
}
