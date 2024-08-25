

public class MatrixIdentityCov {
    public static void main(String[] args) {
       // int[][] b = { { 1, 2, 3 }, { 2, 4, 1 }, { 1, 6, 3 } };
         int[][] b = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    b[i][j] = 1;
                }

                else if (i != j) {
                    b[i][j] = 0;
                }
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]);

            }
            System.out.println();
        }
    }
}
// creating an identity matrix Or converting a given matrix into a identity matrix;