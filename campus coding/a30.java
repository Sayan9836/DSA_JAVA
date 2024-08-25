import java.util.*;

public class a30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenlength = n/2;
        int oddlength = n/2;
        if(n%2 != 0){
            evenlength+=1; 
        }
        int[] even = new int[evenlength];
        int[] odd = new int[oddlength];
        for (int k = 0; k < n; k++) {
            if (k % 2 == 0) {
                even[k/2] = arr[k];
            } else {
                odd[k/2] = arr[k];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        System.out.println(even[even.length - 2] + odd[odd.length - 2]);
    }
}
