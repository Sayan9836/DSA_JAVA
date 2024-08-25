import java.util.*;

public class a28 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int start=sc.nextInt();
    int end = sc.nextInt();

    int ans=start;
    int max=0;
    for(int i=start;i<end;i++){
     int count=countPowerOfTwo(i);
        if(count>max){
            max = count;
            ans = i;
        }
      }
      System.out.println(ans);
    }

static int  countPowerOfTwo(int n){
    if((n & (n-1)) != 0){
        return 0;
    }
    int count=0;
    while(n!=1){
        count++;
        n/=2;

    }
    return count;
}
   
}
