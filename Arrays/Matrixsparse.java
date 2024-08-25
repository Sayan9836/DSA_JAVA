public class Matrixsparse {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 2 }, { 0, 3, 0 }, { 0, 2, 1 } };
        int count = 0;
        int count2 = 0;
        for (int[] array : arr) {
            for (int element : array) {
                if (element == 0) {

                    count++;
                } else {
                    count2++;
                }
            }

        }

        if (count > count2) {
            System.out.println("Matrix is a Sparse Matrix");
        } else {
            System.out.println("Not a sparse Matrix");
        }
    }
}