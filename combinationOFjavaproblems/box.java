public class box {
   private double l;
    double h;
    double w;

    box() {// default constructor;
        // this(4);
        // super(); // every class in java inherit the inbuild object class;
        this.l = -1;
        this.h = -1;
        this.w = -1;

    }

    box(double side) {// same function doing different work is polymorphism; 
        // this(4, 8, 12);
        this.l = side;
        this.h = side;
        this.w = side;

    }

    box(double l, double h, double w) {// parameterised constructor;
        this.l = l;
        this.h = h;
        this.w = w;
    }

    box(box old) {// copy constructor
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

}
//all these ,methods are an example of  method overloading(compile time polymorhism)
// here compiler knows which method to execute;