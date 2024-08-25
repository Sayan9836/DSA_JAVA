import java.util.Iterator;
import java.util.Vector;

//Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However,
// It is synchronized and contains many methods that are not the part of Collection framework.
public class collection3 {
    public static void main(String[] args) {

        Vector<String> V = new Vector<>();
        V.add("sayan");
        V.add("jack");
        V.add("doremon");
        V.add("nobita");

        // for traversing the list;
        Iterator<String> itr = V.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
