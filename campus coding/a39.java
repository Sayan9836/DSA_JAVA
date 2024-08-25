import java.util.*;
public class a39 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a == b){
            int ans = a + c + d - b;
            System.out.println(ans);
        }else if(a==c){
          int ans = a+b+d -c ;
        }else if(a==d){
            int ans = a+b+c -d;
        }else if(b ==c){
            int ans = a + b + d - c;
        }else if(b ==d){
            int ans = a + b + c - d;
        }else if(c == d){
            int ans = a + b + c - d;
        }
    }
}
