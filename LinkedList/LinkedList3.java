class LinkedList3 {

    Node head;

    class Node {

        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    void insert(int val) {

        Node newNode = new Node(val);

        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    void insertlast(int val) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        Node newNode = new Node(val);
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
    }

    void insertafter(int after, int val) {

        Node p = find(after);
        if (p == null) {
            System.out.println("node does not exist");
        }
        Node newNode = new Node(val);
        newNode.next = p.next;
        p.next = newNode;
        newNode.prev = p;
        newNode.next.prev = newNode;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void printRev() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            // System.out.print(temp.val + "->");
            last = temp;
            temp = temp.next;
        }
        // System.out.println("NULL");

        while (last != null) {
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("start");
    }

    public static void main(String[] args) {
        LinkedList3 list3 = new LinkedList3();

        list3.insert(14);
        list3.insert(13);
        list3.insert(12);
        list3.insert(11);
        list3.insert(10);
        list3.insertlast(11);
        list3.insertafter(12, 17);
        list3.print();
        list3.printRev();

    }
}
