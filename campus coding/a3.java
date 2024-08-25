import java.util.Scanner;

public class a3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max= Integer.MIN_VALUE;
        int ans=0;
        for(int i=0 ;i<row;i++){
            int cnt= 0;
            for(int j=0;j<col;j++){
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
            if(cnt > max){
                ans=i;
                max = cnt;
            }
        }

        System.out.println(ans+1);
    }
}
