public class human {

    int age;
    String name;
    float salary;
    boolean married;
    static long population;

    human(int age, String name, float salary, boolean married) {

        this.age = age; // this keyword refers to the current class instance variable; it resolves the
                        // problem of ambiguity(confusion b/w class attributes and parameters);when
                        // instance variable and parameters are same we should use "this" keyword;
        this.name = name;
        this.salary = salary;
        this.married = married;
        human.population += 1;
    }

}
