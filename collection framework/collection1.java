
import java.util.Iterator;
import java.util.LinkedList;

//LinkedList implements the Collection interface. 
//It uses a doubly linked list internally to store the elements.
// It can store the duplicate elements
//It maintains the insertion order and is not synchronized.
public class collection1 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("sayan");
        list.add("jack");
        list.add("doremon");
        list.add("nobita");

        // for traversing the list;
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}