public class Matrixequal {

    public static void main(String[] args) {

        int[][] a = { { 1, 1, 1 }, { 1, 2, 1 }, { 2, 4, 1 } };
        int[][] b = { { 1, 1, 1 }, { 1, 2, 1 }, { 2, 4, 1 } };
        int row1 = a.length;
        int col1 = a[0].length;

        int row2 = b.length;
        int col2 = b[0].length;

        boolean flag = true;

        if (row1 != row2 || col1 != col2) {
            System.out.println(" Matrices are not equal");
        }

        else {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (a[i][j] != b[i][j]) {
                        flag = false;
                        break;
                    }

                }
            }
        }
        if (flag == true) {
            System.out.println("Matrices are equal");
        } else {
            System.out.println("Matrices are not equal");
        }

    }
}
