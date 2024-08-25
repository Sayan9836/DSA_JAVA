
import java.util.Arrays;
import java.util.List;

// creating our own generic arraylist;
public class customgenarraylist<T extends Number> {// generic class ,,,,,, The T type indicates that it can refer to any
                                                   // type of objects;
    // String, Integer, and Employee)
    private Object[] data;
    private static int DEFAULT_SIZE = 1;
    private int size = 0;

    public customgenarraylist() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {

    }

    public void add(T num) {
        if (isfull()) {
            resize();
        }
        data[size++] = num;
    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];// creating new array double the size of old array;
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i]; // copying the current items into the new array;

        }
        data = temp;// pointing data towards temp array;

    }

    private boolean isfull() {

        return size == data.length;
    }

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) data[index];

    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {// overriding the object class toString method;

        return Arrays.toString(data) + " " + size;
    }

    public static void main(String[] args) {
        customgenarraylist<Integer> list5 = new customgenarraylist<>();

        list5.add("ygdgidy");
        list5.add("agifgi");
        System.out.println(list5);// calls the toString method;

        // ArrayList<Integer> list2 = new ArrayList<>();// generics is a parameterised
        // type;integer arraylist cannot print
        // string;
        // list2.add("ahqhb");

    }

}
// if we want to restrict the type of object to number
// then the generic type "T" should extends the number class;
// customgenarraylist<T extends Number>{};
// T should be either number or its suclasses(int,float);
