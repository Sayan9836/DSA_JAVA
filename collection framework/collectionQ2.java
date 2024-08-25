import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.Iterator;

//In Deque, we can remove and add the elements from both the side
//Deque stands for a double-ended queue which enables us to perform the operations at both the ends.
public class collectionQ2 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("Sayan");
        dq.add("nobita");
        dq.add("ninja");
        dq.add("krihna");
        dq.add("xhsg");

        // Iterator<String> itr = dq.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());

        // }
        for (String str : dq) {
            System.out.println(str);
        }
    }
}
