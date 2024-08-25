

public class SElargest {
    public static void main(String[] args) {
        int[] arr = { 6, 7, 2, 4, 3, 5 };
       int aaab= SElargest.sort(arr);
        System.out.println(aaab);

    }

    static int sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr[arr.length-2];

    }

}