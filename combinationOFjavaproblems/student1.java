public class student1 implements Comparable<student1> {

    int rollNO;
    float marks;

    public student1(int rollNO, float marks) {
        this.rollNO = rollNO;
        this.marks = marks;
    }

    @Override
    public int compareTo(student1 o) {
        int diff = (int) (this.marks - o.marks);
        return diff;
    }

    public static void main(String[] args) {
        student1 sayan = new student1(90, 51.90f);
        student1 kunal = new student1(45, 56.90f);

        if (sayan.compareTo(kunal) > 0) {
            System.out.println(" sayan has more marks than kunal");

        } else if (sayan.compareTo(kunal) == 0) {
            System.out.println("Sayan and kunal has equal marks");
        } else {
            System.out.println("sayan has less marks than kunal");
        }

    }

}
