
public class sayan {
    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };

        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i] / 2;
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }
}
