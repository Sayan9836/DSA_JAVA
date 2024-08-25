
public class LinkedList4 {

    private Node head;
    private Node tail;

    LinkedList4() {

        this.tail = null;
        this.head = null;
    }

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }

        tail.next = newnode;
        newnode.next = head;
        tail = newnode;

    }

    void delete(int data) {

        Node curr = head;
        if (curr == null) {
            return;

        }
        if (curr.data == data) {

            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = curr.next;
            if (n.data == data) {
                curr.next = n.next;
                break;
            }
            curr = curr.next;
        } while (curr != head);
    }

    void display() {
        Node node = head;
        if (node != null) {
            do {
                System.out.print(node.data + "->");
                node = node.next;
            } while (node != head);
            System.out.println("head");
        }
    }

    public static void main(String[] args) {

        LinkedList4 list4 = new LinkedList4();
        list4.insert(10);
        list4.insert(11);
        list4.insert(12);
        list4.insert(13);
        list4.delete(12);
        list4.display();
    }
}
