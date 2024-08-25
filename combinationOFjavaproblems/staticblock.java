public class staticblock {
    static int a = 2;
    static int b;

    static {
        System.out.println(" hello i am static block");
        b = a*2;// this is how static instance variable is initialised;
    }

    public static void main(String[] args) {
       // staticblock Obj = new staticblock();
        System.out.println(staticblock.a + " " + staticblock.b);
    }

}
