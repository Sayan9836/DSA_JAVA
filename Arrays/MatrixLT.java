
public class MatrixLT {

    public static void main(String[] args) {
        int[][] a = { { 1, 1, 2 }, { 2, 3, 1 }, { 1, 2, 3 } };
        int i, j;
        int[][] b = new int[3][3];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (j > i) {
                    b[i][j] = 0;
                    System.out.print(b[i][j] + " ");

                } else {
                    b[i][j] = a[i][j];
                    System.out.print(b[i][j] + " ");

                }
            }
            System.out.println("\n");
        }

    }

}
