import java.util.*;
public class a19 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int sum = 0;
    int sum2 = 0;
    for(int i=1;i<=m;i++){
        if(i%4 == 0){
            sum+=i;
        }else if(i%4!=0){
            sum2+=i;
        }
    }
    int val = sum2 - sum;
    System.out.println(val);
  }
}
