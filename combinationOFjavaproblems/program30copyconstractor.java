class program30 {
    private int a;
    private String b;

    program30(int a, String b) {
        this.a = a;
        this.b = b;
    }

    program30(program30 ref) {
        a = ref.a;
        b = ref.b;
        System.out.println(a + "  " + b);
    }
}

public class program30copyconstractor {
    public static void main(String args[]) {
        program30 s = new program30(10, "subhajit kundu");
        program30 r = new program30(s);
    }
}
