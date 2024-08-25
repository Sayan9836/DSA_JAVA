import java.util.Iterator;
import java.util.PriorityQueue;

public class collectionQ1 {
    public static void main(String[] args) {
        // It holds the elements or objects which are to be processed by their
        // priorities
        PriorityQueue<String> q = new PriorityQueue<>();

        q.add("Sayan");
        q.add("doremon");
        q.add("nobita");
        q.add("shinchan");
        q.add("gian");

        System.out.println("head: " + q.peek());// it return null if the queue is empty;
        System.out.println("head: " + q.element());// it throws NoSuchElementException if the queue is empty;

        System.out.println("traversing the Queue");
        Iterator<String> itr = q.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        q.poll();// it return null if the queue is empty;
        q.remove();// it throws NoSuchElementException if the queue is empty;

        System.out.println("Traversing afer removing the Element");
        Iterator<String> itr2 = q.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
