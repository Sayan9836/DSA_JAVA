import java.util.*;

public class a10 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
     }

     
     int[] dp = new int[101];
     int invalid = 0;
     for(int i = 0;i<arr.length; i++){
      if(arr[i]<0 || arr[i] > 100){
        invalid++;
        continue;
      }
        dp[arr[i]]++;
     }

    int i=0;
    int cnt=0;
    int start=0;
    while(i<101){
      cnt+=dp[i];
      if (i == 9 || i==19 || i==29 || i==39 || i==49 ||i==59 || i==69 || i==79 || i==89 || i==100) {
        System.out.println(start+"-"+i+": "+cnt);
        System.out.println();
        start=i+1;
        cnt=0;
      }
      i++;
    }
    if (invalid !=0) {
      System.out.println("Invalid: "+invalid);
    }
  }
}
