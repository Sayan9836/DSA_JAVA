import java.util.List;

import org.w3c.dom.Node;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public org.w3c.dom.Node value;

    public LL() {
        this.size = 0;
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            head = tail;
        }
        size++;

    }

    public void insertlast(int val) {
        if (tail == null) {
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int index, int val) {
        if (index == 0) {
            insertfirst(val);
            return;
        }
        if (index == size) {
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deletefirst() {
        if (head == null) {
            tail = null;
        }
        int val = head.value;
        head = head.next;
        size--;
        return val;
    }

    public int deletelast() {
        if (size <= 1) {
            return deletefirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        secondlast.next = tail.next;
        tail = secondlast;
        tail.next = null;
        size--;
        return val;
    }

    private LL.Node get(int i) {
        Node curr=head;
       while (curr.next!=i) {
           
       }
    }

    public int delete(int index) {
        if (index == 0) {
            return deletefirst();
        }
        if (index == size - 1) {
            return deletelast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public void insertrec(int val, int index) {
        head = insertrec(val, index, head);

    }

    private Node insertrec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);

            size++;
            return temp;
        }
        // if index!=0 move forward;
        node.next = insertrec(val, index - 1, node.next);
        return node;
    }

    // to find a given value(node) into the linked list
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;

            }
            node = node.next;
        }
        return null;
    }

    // to find the duplicate numbers
    public void duplicate() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
            }
            node = node.next;
        }
        tail = node;
        tail.next = null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(10);
        list.insertfirst(5);
        list.insertfirst(53);
        list.insertfirst(51);
        list.display();
    }
}
