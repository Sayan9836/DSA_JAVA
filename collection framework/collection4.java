import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//The ArrayList class implements the List interface
//It uses a dynamic array to store the duplicate element of different data types.
//The ArrayList class maintains the insertion order and is non-synchronized.
public class collection4 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("sayan");
        list.add("jack");
        list.add("doremon");
        list.add("nobita");

        // for traversing the list;
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        System.out.println("Traversing the list in reverse Order\n");
        ListIterator<String> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()) {
            System.out.println(list1.previous());
        }
    }
}
