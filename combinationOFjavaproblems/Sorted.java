public class Sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 16, 8 };
        System.out.println(sorted1(arr, 0));
    }

    static boolean sorted1(int[] arr, int index) {
        // base condition
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && sorted1(arr, index + 1);
    }
}
