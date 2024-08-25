import java.util.*;
public class a15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];

        for(int i=0;i<20;i++){
            arr[i] = sc.nextInt();
            if(arr[i] <=0 || arr[i] >120){
                System.out.println("INVALID INPUT");
                break;
            }
        }

        int fees = 0;
        for(int a : arr){
            if(a < 17){
                fees+=200;
            }else if( a> 17 && a < 40){
                fees+=400;
            }else{
                fees+=300;
            }
        }

        System.out.println("Total Income"+fees+"INR");
        
    }
}
