import java.util.Scanner;

public class a25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        String ans ="";
        while(num != 0){
            if(num%n >= 10){
                ans=(char)(65+ ((num%n) - 10)) + ans;
            }else{
                ans= num%n + ans;
            }
            num/=n;
        }

        System.out.println(ans);
    }
}
