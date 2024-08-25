import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Scanner in = new Scanner(System.in);
        String b = in.next();
        System.out.println(a.equals(b));

        sc.close();
        in.close();
    }
}
