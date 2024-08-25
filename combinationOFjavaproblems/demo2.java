public class demo2 {
    public static void main(String[] args) {
        demo2.divide(3, 0);
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {// when b=0;it will disrupt the flow of a programme;and the remaining code will
                     // not execute; to solve this problem we use try-catch block;
            throw new ArithmeticException("please do no divide by zero");
        }
        System.out.println("hii");

        return a / b;
    }
}
// for exception handling we use try-catch block;
// throws use to declare an exception;it specifies here exception may occur;
