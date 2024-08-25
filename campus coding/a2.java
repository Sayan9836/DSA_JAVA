import java.util.Scanner;

public class a2 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int cnt=0;
        for(int a : arr){
            if(a>max){
                cnt++;
                max=a;
            }
        }

        System.out.println(cnt);
    }
}
