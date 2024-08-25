import java.util.Iterator;
import java.util.TreeSet;

public class collectionsS3 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();// Creating a Hashset;
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
// Java TreeSet class implements the Set interface that uses a tree for storage.
// Like HashSet, TreeSet also contains unique elements
// However, the access and retrieval time of TreeSet is quite fast
// The elements in TreeSet stored in ascending order.