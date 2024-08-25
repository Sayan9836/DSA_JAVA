import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      if (n > 10 || n <= 0 || 10 - n < 5){
        System.out.println("INVALID INPUT");
      }else {
        System.out.println("NUMBER OF CANDIES SOLD : "+n);
        System.out.print("NUMBER OF CANDIES AVAILABLE : "+(10-n));

      }
    }
}
