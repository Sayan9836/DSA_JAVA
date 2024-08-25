import java.util.Scanner;

public class a7 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][] trainee = new int[3][3];
    int[] average = new int[3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            trainee[i][j] = sc.nextInt();
            if(trainee[i][j] < 1 || trainee[i][j] > 100){
                trainee[i][j] = 0;
            }
        }
    }
    int max = Integer.MIN_VALUE;
    for(int i=0;i<3;i++){
        int sum = 0;
        for(int j=0;j<3;j++){
            sum+= trainee[j][i];
        }
        average[i] = sum / 3;
        max= Math.max(max,average[i]);
    }

     for( int i = 0 ; i<3;i++){
        if(average[i] == max){
            System.out.println("Trainee Number : " + (i+1));
        }else if( average[i] < 70){
            System.out.println("All trainees are Unfit");
        }
     }
    sc.close();
   } 
}
