public class student18 implements Cloneable {
    String name;
    int rollNO;

    public student18(String name, int rollNO) {
        this.name = name;
        this.rollNO = rollNO;
    }

  // protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
   // }

    public static void main(String[] args) {
        try {
            student18 s1 = new student18("sayan", 90);
            student18 s2 = (student18) s1.clone();// return the shallow copy of an object s1;

            System.out.println(s1.name + " " + s1.rollNO);
            System.out.println(s2.name + " " + s2.rollNO);
        } catch (CloneNotSupportedException e) {

        }
    }

}
// try-catch block is used to handled the exception;
// Thus, the clone() copies the values of an object to another. So we don't need
// to write explicit code to copy the value of an object to another.
