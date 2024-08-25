public class main5 {
    public static void main(String[] args) {
        // here constructor overloading is taking place as parameters are different;
        // and the compilers knows which method to execute;
        // box box = new box();// calling default cnstructor;
        // box box1 = new box(2, 4, 5);// calling parameterised constructor;
        // System.out.println(box.l + " " + box.h + " " + box.w);

        // the reference varible of the superclass determines,what are the methods or
        // variables that can be accessed;
        // which method to execute is determined by the type of object;
        // you are given ascess to the variables that are in the ref type;
        // box box5 = new boxweight(2, 3, 4, 5);// box5 is a reference variable of
        // parent class box,referencing to the
        // type(boxweight)
        // of object
        // System.out.println(box5.weight);// there is no weigth present in the
        // box(parent) class;

        // boxweight box6=new box(1,2,3);//weight variable is not present in parent
        // class;
        // System.out.println(box6);

        shapes shape = new shapes();
        circle circle = new circle();// object is created;
        square square = new square();
        circle.area();
    }
}
// parent obj=new child();
// here what are the methods that can be ascessible depends on the type of ref
// variable;
// here which method will be called is depends on the type of child,this is
// called "upcasting";
// this is how overriding works;
