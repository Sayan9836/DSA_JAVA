import java.util.*;

public class a33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students placed in CSE:");
        int a = sc.nextInt();
        System.out.print("Enter the no of students placed in ECE:");
        int b = sc.nextInt();
        System.out.print("Enter the no of students placed in MECH:");
        int c = sc.nextInt();

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Input");
        }
        if (a == b && b == c) {
            System.out.println("None of the Department has got the higest placement");
        }
        String ans = "";
        if(a>b && a>c){
            ans = "CSE";
        }else if(b>c && b>a){
            ans = "ECE";
        }else{
            ans = "MECH";
        }
        System.out.println("Higest placement");
        System.out.println();
        System.out.println(ans);
    }

}
