import java.util.Scanner;

public class a17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(Character.isDigit(str.charAt(0))|| str.contains(" ") || str.contains("/") || str.length()<4){
            System.out.println("0");
        }else{
            int upperCase = 0;
            int digit =0;
         for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
           if((int)ch >=64 && (int)ch <=90){
             upperCase++;
           }
           if(Character.isDigit(ch)){
             digit++;
           }  
          }

          if(upperCase > 0 && digit  > 0){
            System.out.println("1")
          }
        }
    }
}
