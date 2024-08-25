
import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {

        System.out.println("Enter the number of the Rows:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter the number of Column:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int i, j;
        int t = 0;

        System.out.println("Enter the Elements:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("The Array with Matrix form is :");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
                t = t + arr[r][c];
            }

            System.out.println("\n");

        }
        System.out.println("The Sum of the Array is :" + t);
    }
}
