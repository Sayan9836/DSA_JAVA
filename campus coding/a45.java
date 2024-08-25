import java.util.*;
public class a45 {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        System.out.println(map.getOrDefault(target,0));
    }
}
