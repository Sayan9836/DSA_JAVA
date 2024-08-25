public class nestedtryblock {
    public static void main(String[] args) {
        //outer block
        try{
            // inner try block 1
            try {
                int a=23/0;
            } catch (ArithmeticException e) {
                System.out.println(e);
                
            }
            //inner try block 2
            try {
                int arr[]=new int[5];
                arr[5]=4;
                
            } catch (IndexOutOfBoundsException e) {
                System.out.print(e);
            }
            // catch block for outer block
            catch(Exception e){
                System.out.println("handel the total(outer) block exception");
            }
        
            System.out.println("rest of the code");
        }
        
        
    }

}
// When any try block does not have a catch block for a particular exception,
// then the catch block of the outer (parent) try block are checked for that
// exception, and if it matches, the catch block of outer try block is executed.

// If none of the catch block specified in the code is unable to handle the
// exception, then the Java runtime system will handle the exception. Then it
// displays the system generated message for that exception.
