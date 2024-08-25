import java.util.*;

public class a12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        String end = sc.next();

        int[] paths = { 800, 600, 750, 900, 1400, 1200, 1100, 1500 };
        String[] names = { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };

        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == start) {
                firstIndex = i;
            } else if (names[i] == end) {
                lastIndex = i;
            }
        }
        int sum = 0;
        int i = firstIndex+1;
        while (i !=lastIndex+1) {
            sum += paths[i];
            i=(i+1)%paths.length;
        }
        System.out.println(sum);
        System.out.println(Math.ceil(sum*0.005) + " INR");
    }
}
