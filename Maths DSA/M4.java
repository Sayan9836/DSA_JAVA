import java.util.Scanner;

public class M4 {
    // find the nth magic no:--------
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int base = sc.nextInt();
       int ans = 0;
       while (n>0) {
         int last=n&1;
         ans+=last * base;
         n=n>>1;
         base=base*base;
       }

    System.out.println(ans);

    sc.close();
    }
}
