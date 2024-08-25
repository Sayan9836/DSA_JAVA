public class P4 {

    public static void main(String[] args) {
        int no=18;
        if (no%sumOfDigits(no)==0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }

    static int sumOfDigits(int no) {
        int sum = 0;
        while (no > 0) {
            sum+=no%10;
            no/=10;
        }
        return sum;
    }
}
