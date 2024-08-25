public class main3 {
    public static void main(String[] args) {
        human sayan = new human(19, "sayan", 10000, false);
        human rahul = new human(34, "Rahul", 15000, true);
        System.out.println(sayan.age);
        System.out.println(sayan.name);
        System.out.println(sayan.salary);
        System.out.println(rahul.age);
        System.out.println(rahul.name);
        System.out.println(rahul.salary);
        System.out.println(human.population);// to ascess static method we have to use the class name;
    }

    static void fun2() {
        // greetings(); // we have to create a object of it otherwise it is not
        // ascessible here;

        main3 Obj = new main3();// here object is created of method greetings();
        Obj.greetings();// . is used to bind instance variable or methods with reference variable;

    }

    void fun() {
        greetings();// we can ascess it as we know at the end it will be call by a static method
                    // where we have to create a object// this is same as {this.greetings()};

    }

    void greetings() {
        fun2();// static method can be ascessed from a non-static method;
        System.out.println("HELLO WORLD");
    }
}


 public class InnerClasses {

    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);// this is "a.toString",,,; println calls the "toString"  method;

       System.out.println(a.name);
        System.out.println(b.name);
 }
}
