import java.util.Collections;
import java.util.PriorityQueue;

public class p67 {
    public static void main(String[] args) {
        int[] arr = { 8, 5, 2, 6, 7, 9, 4 };

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> q1 = new PriorityQueue<>();

        for (int ele : arr) {
            q.add(ele);
            q1.add(ele);
        }
        System.out.println(q.peek());
        System.out.println(q1.peek());

    }

}
