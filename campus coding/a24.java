import java.util.Scanner;

public class a24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    arr[i] = arr[i] +arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i]-arr[j];
                }
            }
        }
        if(arr[0] + arr[1] <= sum){
            System.out.println(arr[0] * arr[1]);
        }else{
            System.out.println("0");
        }
    }
}
