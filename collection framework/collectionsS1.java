import java.util.HashSet;
import java.util.Iterator;

public class collectionsS1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();// Creating a Hashset;
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
// HashSet class implements Set Interface
// It represents the collection that uses a hash table for storage.
// Hashing is used to store the elements in the HashSet. It contains unique items.
// it does not maintain the insertion order