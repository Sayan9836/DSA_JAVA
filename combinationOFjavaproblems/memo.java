public class memo {

    public static void main(String[] args) {
        try {// here we write the exception code;
            String name = "Sayan";

            if (name.equals("Sayan")) {

                throw new MyException("name is Sayan");

            }
        } catch (MyException e) {// here we handle the exception;
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("parent Exception");

        } finally {
            System.out.println("this will always execute");
        }

    }

}
// for multiple catch block we have to maintain the order of exception;otherwise
// it will give compile-time-error;
// AR>IOB>PE;
