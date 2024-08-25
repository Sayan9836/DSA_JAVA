public class indexsum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 3, 4, 6, 7 };
        int element = 8;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                sum = arr[i] + arr[j];
                if (element == sum) {
                    System.out.printf("%d %d", i, j);
                    System.out.print("\n");

                }
                sum = 0;
            }
        }
    }
}
