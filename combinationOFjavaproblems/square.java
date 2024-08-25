class square extends shapes {
    @Override // this is annotation used to check, whether a function is overriden or not;
    void area() {
        System.out.println("hi i am windows");
    }
}
// a function with same name and parameters but different body is called
// overriding;(runtime polymorphism)
// dynamic method dispatch;
// static variable cannot be override as overrinding depends on object and
// static variable does not depends on object;
// static variable can be inherited;
