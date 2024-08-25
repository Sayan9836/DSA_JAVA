public class javaException {
    public static void main(String[] args) {
        try {
            int a = 100 / 0;
            if (a == 0) {
                throw new ArithmeticException("hii");
            }
            // catch (ArithmeticException e) {// inbuild exception;
            // System.out.println(e);
        } finally {
            System.out.println("dhghgh");
        }
    }

}
