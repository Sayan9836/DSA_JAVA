import java.util.Scanner;
public class a4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int n = sc.nextInt();
         int[] Enter = new int[n];

         for(int i=0;i<n;i++){
          Enter[i] = sc.nextInt();
         }
         int[] Exit =new int[n];

         for(int i=0;i<Exit.length;i++){
            Exit[i] = sc.nextInt();
         }
         int max=Enter[0] - Exit[0];
         int ans = 0;
         for(int i=0;i<n;i++){
            ans+=Enter[i] - Exit[i];
            max=Math.max(ans,max);
         }

         System.out.println(max);
    }
}
