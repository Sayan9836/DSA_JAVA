public class main1 {
    int x;

    public static void main(String[] args) {
        main1 Obj1 = new main1();
        main1 Obj2 = new main1();
        Obj2.x = 23;
        System.out.println(Obj1.x);
        System.out.println(Obj2.x);
        main1 myObj = new main1();
        myObj.MyClass();
        main1.lll();
    }

    public void MyClass() { // need to create an object to ascess public class;
        System.out.println("HELLO WORLD");
    }

    static void lll() { // no need to create an object;
        System.out.println("HELLO JAVA");
    }
}
