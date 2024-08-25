public class MatrixSUMrowcol {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 1 }, { 3, 4, 2 }, { 1, 0, 1 } };
        int sum = 0;
        int cum = 0;
        int row = a.length;
        int col = a[0].length;
        for (int i = 0; i < row; i++) {
            sum = 0;
            for (int j = 0; j < col; j++) {
                sum = sum + a[i][j];
            }
            System.out.println("sum of "+ (1+i)+ "row: " + sum);
        }
        for (int i = 0; i < col; i++){
            cum = 0;
            for (int j = 0; j < row; j++) {
                cum = cum + a[j][i];
            }
            System.out.println("sum of "+ (1+i)+ "col: " + cum);
        }

    }
}
