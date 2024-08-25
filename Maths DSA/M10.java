public class M10 {
    // find X-OR from 0 to a
    public static void main(String[] args) {
        // after every four no the pattern is repeating;
        int a = 10;
        int result = -1;
        if (a % 4 == 0) {
            result = a;
        } else if (a % 4 == 1) {
            result = 1;
        } else if (a % 4 == 2) {
            result = a + 1;
        } else if (a % 4 == 3) {
            result = 0;
        }

        System.out.println(result);
    }
}
