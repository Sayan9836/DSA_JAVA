public class Matrixsum {
    public static void main(String[] args) {

        int[][] arr1 = { { 1, 2, 4 }, { 1, 2, 1 }, { 2, 4, 1 } };
        int[][] arr2 = { { 2, 1, 3 }, { 1, 4, 2 }, { 0, 1, 3 } };
        int[][] sum = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                sum[row][col] = arr1[row][col] + arr2[row][col];
                System.out.print(sum[row][col] +" ");
                sum[row][col]=0;
            }
            System.out.println("\n");
        }
    }
}
