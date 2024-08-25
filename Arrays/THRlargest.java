public class THRlargest {
    public static void main(String[] args) {
        int[] arr = { 6, 7, 2, 4, 3, 5 };
       int abc= THRlargest.sort(arr);
        System.out.println(abc);

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
        return arr[arr.length-3];

    }
}
