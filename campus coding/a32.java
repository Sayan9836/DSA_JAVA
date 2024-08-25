import java.util.*;
public class a32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i=start;i<=end;i++){
            if(isPalindrome(i)){
             System.out.println(i);
            }
        }
    }


   static boolean isPalindrome(int n){
        int sum=0;
        int rev = n;
        while(n>0){
            sum=sum*10+n%10;
            n/=10;
        }
        return sum == rev;
    }
}
