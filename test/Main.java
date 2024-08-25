import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Scanner sc =  new Scanner(System.in);

        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i< n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        int[] arr = {567, 206, 40, 195, 647, 81, 40, 339, 40, 797, 40};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele : arr) {
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        int cnt = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            cnt+=entry.getValue()/2;
        }

        System.out.println(cnt);

    }
    
}