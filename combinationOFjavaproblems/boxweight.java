public class boxweight extends box {
    double weight;

    boxweight() {
        this.weight = -1;
    }

    boxweight(double l, double h, double w, double weight) {
        super(l, h, w);// it is used to inherit the properties of parent class
                       // constructorl;orinitialise the values present in parent class
        this.weight = weight;
        // we should use super keyword if we want to ascess the variable of superclass
        // when same name variable is present in both the super and sub classes;
    }

}
