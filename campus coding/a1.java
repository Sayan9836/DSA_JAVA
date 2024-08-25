import java.util.Scanner;

public class a1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();

        int two = ((4 * v) - w) / 2;
        if ((w<2 || w< 2)) {
            System.out.println("Invalid");
        }

        System.out.println(two + " " + (v-two) );
    }
}
