import java.util.*;

public class a37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr.length == 0) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if (sum >= (r * unit)) {
                    System.out.println(i+1);
                    break;
                }
            }
            if(sum<(r*unit)){
            System.out.println("0");
            }
        }
    }
}
