import java.util.Iterator;
import java.util.LinkedHashSet;

public class collectionsS2 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();// Creating a LinkedHashset;
        set.add("sayan");
        set.add("ayan");
        set.add("cayan");
        set.add("layan");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
// LinkedHashSet class represents the LinkedList implementation of Set Interface
// It extends the HashSet class and implements Set interface.
// Like HashSet, It also contains unique elements.
// It maintains the insertion order and permits null elements.