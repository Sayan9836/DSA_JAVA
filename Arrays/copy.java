public class copy {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 45 };
        int[] a2 = new int[a1.length];
        int i = 0;

        for (i = 0; i <= a1.length - 1; i++) {

            a2[i] = a1[i];
        }
        for (i = 0; i <= a1.length - 1; i++) {
            System.out.println(a1[i] + "");
        }
        System.out.println("------------------------------");
        for (i = 0; i <= a1.length - 1; i++) {
            System.out.println(a2[i] + "");
        }
    }
}