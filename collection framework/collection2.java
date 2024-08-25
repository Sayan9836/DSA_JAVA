import java.util.Iterator;
import java.util.Stack;

//The stack is the subclass of Vector. It implements the last-in-first-out data structure
public class collection2 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();// Creating a Stack
        stack.push("sayan");
        stack.push("jack");
        stack.push("doremon");
        stack.push("nobita");

        stack.pop();// removes the last inserted element;

        // for traversing the list;
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
