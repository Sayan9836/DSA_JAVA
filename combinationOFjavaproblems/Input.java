import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] arr) {
        arr[1]=10;
    }
}