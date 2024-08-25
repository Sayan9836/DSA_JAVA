public class demo {

    public static void main(String[] args) {
        demo.divide(3, 0);
    }

    static int divide(int a, int b) throws ArithmeticException {
        try {
            // int b = 1;
            if (b == 0) {
                throw new ArithmeticException("please do no divide by zero");
            }

        } catch (ArithmeticException e) {
            System.out.println(e);

        }
        System.out.println("hello java");

        return a / b;

    }

}
