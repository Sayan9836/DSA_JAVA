
import java.util.Arrays;

// creating our own arraylist;
public class customarraylist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public customarraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isfull()) {
            resize();
        }
        data[size++] = num;
    }

    public void resize() {
        int[] temp = new int[data.length * 2];// creating new array double the size of old array;
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i]; // copying the current items into the new array;

        }
        data = temp;// pointing data towards temp array;

    }

    private boolean isfull() {

        return size == data.length;
    }

    public int remove() {
        return data[--size];
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return data[index];

    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {// overriding the object class toString method;

        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        customarraylist list = new customarraylist();

        list.add(45);
        list.add(3);
        System.out.println(list);// calls the toString method;

        // ArrayList<Integer> list2 = new ArrayList<>();// generics is a parameterised
        // type;integer arraylist cannot print
        // string;
        // list2.add("ahqhb");

    }

}
