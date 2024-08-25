
public class Matrixsparsecov {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 0, 6 }, { 0, 2, 1 } };
       /*/ for (int[] array : arr) {
            for (int element : array) {
                if (element == 0) {
                    element = 1;
                } else {
                    element = 0;
                }
            }
        }*/
       
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
            
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("\n");
        }
    }
}
