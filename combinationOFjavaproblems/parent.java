public abstract class parent {
    int age;

    final val=VALUE;

    public parent(int age){
        this.age=age;
        VALUE=1245;
    }

    static void hello() {
        System.out.println("hello");
    }

    abstract void good();

    abstract void bad();
}

public abstract class Parent2 {

    int age;
    final int VALUE;

    public Parent2(int age) {
        this.age = age;
        VALUE = 32456789;
    }

    static void hello() {
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

    abstract void good();

    abstract void bad();
}

public class Son extends parent {

    // abstract method are the method which does not have a body;
    // they needs to inherited by the child class to define abstract method;

    public Son(int age) {
        super(age);
    }

    void good() {
        System.out.print(" hi i am sayan");
    }

    void bad() {

        System.out.println("gjyffjkh");
    }

}

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void good() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void bad() {
        System.out.println("I love Iron Man");
    }

    public static void main(String[] args) {
        Son son = new Son(30);
        son.good();
        parent dauter = new Daughter(30);
        dauter.bad();
        parent.hello();
    }
}
