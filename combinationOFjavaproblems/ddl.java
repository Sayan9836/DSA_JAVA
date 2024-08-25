import org.w3c.dom.Node;

public class ddl {
    private Node head;

    public void insertfirst1(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    // to insert at the last;
    public void insertlast1(int val) {
        Node node = new Node(val);
        Node end = head;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (end.next != null) {
            end = end.next;
        }
        end.next = node;
        node.prev = end;
        node.next = null;

    }

    // to insert after an index;
    public void insert2(int val, int index) {
        Node node = new Node(val);
        Node pin = find(index);
        if (pin == null) {
            System.out.println("not exist");
        }
        node.next = pin.next;
        pin.next = node;
        node.prev = pin;
        if (node.next != null) {
            node.next.prev = node;
        }

    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.println(node.val + "->");
            node = node.next;
        }
        System.out.println(" ");
    }

    // to display the linkedlst in reverse order;
    public void displayrev() {
        Node last = null;
        do {
            last = last.prev;
            System.out.println(last.val + "->");
        } while (last != null);
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
