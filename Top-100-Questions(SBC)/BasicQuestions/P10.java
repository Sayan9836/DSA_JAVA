import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();

        for(int i=2;i*i<=n;i++){
            if (n%i==0) {
                if (n/i==i) {
                    System.out.println(i);
                }else{
                    System.out.println(i);
                    System.out.println(n/i);
                }

            }
        }
        sc.close();
    }
}
