import java.util.*;
public class a18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for( int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int diff = sc.nextInt();
        int ans=0;
       for(int i=0;i<n;i++){
        int absolute = (int)Math.abs(num - arr[i]);
        if(absolute <= diff){
            ans++;
        }
       }
       if(ans==0){
        System.out.println("-1");
       }
       System.out.println(ans);
    }
}
