import java.util.Scanner;

public class a22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ans=0;
        int carry = 0;
        int sum =0;
        while(num1>0 && num2>0){
            ans=num1%10+num2%10 + carry;
            carry=ans/10;
            sum+=carry;
            num1/=10;
            num2/=10;
        }
        sum+=carry;
        System.out.println(sum);
    }
}



