
import java.util.Arrays;

public class M12 {
    // leetcode problem;
    // flipping an image;
    public static void main(String[] args) {
        int image[][] = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        for (int[] row : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap;
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        System.out.println(Arrays.deepToString(image));

    }
}
