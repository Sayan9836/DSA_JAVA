public class student {
    public static void main(String[] args) {
        student1 sayan = new student1();
        System.out.println(sayan.rollNO);
        System.out.println(sayan.Name);
        System.out.println(sayan.marks);
        sayan.greetings();

    }

}

class student1 {
    int rollNO;
    String Name;
    float marks;

    student1(int rollNO, String Name, float marks) {
        this.rollNO = rollNO;
        this.Name = Name;
        this.marks = marks;
    }

    void greetings() {
        System.out.println("hello my name is " + this.Name);
    }

    student1() {
        this(23, "sayan", 89.8f);// this is how you call a constructor from another constructor;
    }

}
