public class NoOfElements {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int count = 0;
        for (int element : arr) {
            System.out.println(element);

            count++;
        }
        System.out.println("--------------------------");
        System.out.println(count);
    }
}
