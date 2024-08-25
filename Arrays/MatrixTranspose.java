

public class MatrixTranspose {
    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int row = arr.length;
        int col = arr[0].length;
        int[][] t=new int[3][3];
        

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                // t[i][j] = arr[j][i];
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
           // System.out.print(arr[i][j]);
           //System.out.println("\n");

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("\n");
        }

    }
}

