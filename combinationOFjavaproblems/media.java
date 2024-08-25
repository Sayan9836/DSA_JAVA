public interface media {
    void start();

    void stop();

}

public interface enjine {
    void start();

    void stop();
}public interface break{

void break();

}

public class Car implements break,enjine,media{

    public void break() {
        System.out.println("i am using the break");
    }

    public void start() {
        System.out.println("I start engine like a normal Car");
    }

    public void stop() {
        System.out.println("I stop engine like a normal Car");
    }
}
