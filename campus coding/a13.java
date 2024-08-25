import java.util.*;

public class a13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int TB = sc.nextInt();
        int TP = sc.nextInt();

        int MonkeyEaten = 0;

        if (b > 0) {
            MonkeyEaten = TB / b;
            TB = (TB % b);
        } 

        if (p > 0) {
            MonkeyEaten += TP / p;
            TP = TP % p;
        }

        if (TP+TB > 0) {
            n = n - MonkeyEaten - 1;
        }else{
          n = n - MonkeyEaten;
        }

        System.out.println("Number of Monkeys left on the tree: " + n);
    }
}
