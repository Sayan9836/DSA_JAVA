import java.util.Scanner;

public class a14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parent = sc.next();
        String x = "Y";

        if (x == "N") {
            System.out.println("TOTAL MEMBERS: " + 1);
            System.out.println("COMMISSION DETAILS");
            System.out.println(parent + ": " + "250 INR");
        } else {
            String child = sc.next();
            String[] words = child.split(",");
            System.out.println("TOTAL MEMBERS: " + (words.length + 1));
            System.out.println("COMMISSION DETAILS");
            System.out.println(parent + ": " + (500 * words.length));
            int i = 0;
            for (String ele : words) {
                if (i % 2 == 0) {
                    System.out.println(ele + ": " + "250 INR");
                } else {
                    System.out.println(ele + " :" + "250 INR");
                }
                i++;
            }
        }
    }
}
