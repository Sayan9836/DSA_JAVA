public class LinkedList1 {
    static Node head;
    static Node tail;
    private int size;

    LinkedList1() {
        this.size = 0;
        LinkedList1.head = null;
        LinkedList1.tail = null;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            // this.next = null;
            size++;

        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    // add first;
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    // add Last;
    void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;

        }
        curr.next = newNode;
        newNode.next = null;

    }

    // delete First;
    void deletefirst() {
        if (head == null) {
            System.out.println("List is Empty");

            return;
        }
        size--;
        head = head.next;
    }

    // Delete Last;
    void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node Last = head.next;
        while (Last.next != null) {
            Last = Last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // get any value by its index
    Node get(int index) {
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;

        }
        return curr;
    }

    // insert at any index
    void insert(int data, int index) {
        if (index == 0) {
            add(data);
            return;
        }
        if (index == size) {
            addlast(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // delete at any index;

    void delete(int index) {
        if (index == 0) {
            deletefirst();
            return;
        }
        if (index == size) {
            deleteLast();
        }
        size--;
        Node prev = head;
        for (int i = 1; i < index; i++) {

            prev = prev.next;
        }
        prev.next = prev.next.next;

    }

    // insertion using recursion;

    void insertRec(int data, int index) {

        head = insertRec(data, index, head);

    }

    Node insertRec(int data, int index, Node node) {

        if (index == 0) {
            Node temp = new Node(data, node);

            // size++;
            return temp;
        }

        else {
            node.next = insertRec(data, --index, node.next);
        }
        return node;

    }

    // remove duplicates from sorted list
    void duplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
                size--;

            } else {
                node = node.next;
            }

        }
        tail = node;
        tail.next = null;

    }

    // In placed reversal of linkedlist
    public void reverseI() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevnode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevnode;

            // update;
            prevnode = currNode;
            currNode = nextNode;

        }

        head.next = null;
        head = prevnode;
    }

    // pair by pair reversing a linkedlist using recursion
    public Node reverseR(Node head) {

        if (head.next == null || head == null) {
            return head;
        }
        Node newnode = reverseR(head.next);
        head.next.next = head;
        head.next = null;
        return newnode;
    }

    // recursion reverse
    void reverse(Node node) {

        if (node == tail) {
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;

    }

    // to reverse a linkedlist between a range
    Node reverseBetween(Node head, int left, int right) {

        if (left == right || head == null) {
            return head;
        }
        Node prev = null;
        Node currNode = head;
        // skip the left-1 node;
        for (int i = 0; currNode != null && i < left - 1; i++) {
            prev = currNode;
            currNode = currNode.next;

        }
        Node last = prev;
        Node newEnd = currNode;

        // reverse the list of a range

        for (int i = 0; currNode != null && i < right - left + 1; i++) {
            Node nextNode = currNode.next;
            currNode.next = prev;

            // update;
            prev = currNode;
            currNode = nextNode;

        }

        // join the reverse part with other element//connect;
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = currNode;

        return head;

    }

    // reversing K nodes in a linkedlist
    Node reverseKNode(Node head, int k) {

        if (k <= 1 || head == null) {
            return head;
        }
        Node currNode = head;
        Node prev = null;

        while (currNode != null) {

            Node last = prev;
            Node newEnd = currNode;

            // reverse the list of a range

            for (int i = 0; currNode != null && i < k; i++) {
                Node nextNode = currNode.next;
                currNode.next = prev;// reversing the pointer;

                // update;
                prev = currNode;
                currNode = nextNode;

            }

            // join the reverse part with other element//connect;
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = currNode;

        }
        return head;

    }

    // reverse alternate K node;
    Node reverseAlternateKNode(Node head, int k) {

        if (k <= 1 || head == null) {
            return head;
        }
        Node currNode = head;
        Node prev = null;

        while (currNode != null) {

            Node last = prev;
            Node newEnd = currNode;

            // reverse the list of a range
            Node nextNode = currNode.next;
            for (int i = 0; currNode != null && i < k; i++) {
                currNode.next = prev;// reversing the pointer;

                // update;
                prev = currNode;
                currNode = nextNode;

                if (nextNode != null) {
                    nextNode = nextNode.next;
                }

            }

            // join the reverse part with other element//connect;
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = currNode;

            // Skip the K nodes
            if (currNode != null) {
                for (int i = 0; i < k; i++) {
                    prev = currNode;
                    currNode = currNode.next;
                }
            }

        }
        return head;

    }

    // merge two sorted list
    /*
     * / public static LinkedList1 merge(LinkedList1 first, LinkedList1 second) {
     * Node f = first.head;
     * Node s = second.head;
     * 
     * LinkedList1 ans = new LinkedList1();
     * 
     * while (f != null && s != null) {
     * if (f.data < s.data) {
     * ans.addlast(f.data);
     * f = f.next;
     * } else {
     * ans.addlast(s.data);
     * s = s.next;
     * }
     * }
     * while (f != null) {
     * ans.addlast(f.data);
     * f = f.next;
     * 
     * }
     * while (s != null) {
     * ans.addlast(s.data);
     * s = s.next;
     * 
     * }
     * 
     * return ans;
     * 
     * }/
     */

    // cycle detection
    public boolean isCycle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }

        }
        return false;
    }

    // length of the Cycle
    public int lengthCycle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                int length = 0;
                do {
                    slow = slow.next;
                    length++;
                } while (slow != fast);
                return length;
            }

        }
        return -1;
    }

    // Find Start of the Cycle
    Node startCycle() {
        // find length of the cycle
        int length = 0;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle();
                break;
            }

        }

        if (length == 0) {
            return null;
        }
        // move s node by length of the cycle;
        Node f = head;
        Node s = head;
        while (length > 0) {
            s = s.next;
            length--;

        }
        // move s and f one by one and they will meet at start
        while (f != s) {
            f = f.next;
            s = s.next;

        }
        return s;

    }

    // Happy number
    boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number = number / 10;
        }
        return ans;
    }

    // middle of the Linkedlist
    Node middle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // to sort a LinkedList;
    /*
     * Node sortlist(Node head) {
     * if (head == null || head.next == null) {
     * return head;
     * }
     * Node mid = middle();
     * Node left = sortlist(head);
     * Node right = sortlist(mid);
     * 
     * return merge(left, right);
     * 
     * }/
     */

    // bubble sort to sort a linkedlist;
    void bubblesort() {
        bubblesort(size - 1, 0);
    }

    private void bubblesort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.data > second.data) {
                // swap;
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    second.next = tail;
                    first.next = null;

                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubblesort(row, col + 1);
        } else {
            bubblesort(row - 1, 0);
        }
    }

    // palindrome linkedlist
    public boolean isPalindrome(Node head) {

        Node mid = middle();
        Node headsecond = reverseR(mid);

        while (head != null && headsecond != null) {
            if (head.data != headsecond.data) {
                break;
            }
            head = head.next;
            headsecond = headsecond.next;
        }
        return head == null || headsecond == null;
    }

    // ReOrder list
    void ReOrder(Node head) {
        if (head == null || head.next == null) {
            return;

        }
        Node mid = middle();
        Node hs = reverseR(mid);
        Node hf = head;

        // reArrange
        while (hf != null && hs != null) {
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;

        }
        if (hf != null) {
            hf.next = null;
        }

    }

    // rotate list
    Node rotateleft(Node head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }
        Node last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }
        int rotations = k % length;

        last.next = head;
        Node newLast = head;
        for (int i = 0; i < rotations - 1; i++) {
            newLast = newLast.next;

        }
        head = newLast.next;
        newLast.next = null;
        return head;
    }

    public int getSize() {
        return size;
    }

    // printing the list
    void printList() {
        if (head == null) {
            System.out.println("list is Empty");
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;

        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        LinkedList1 list1 = new LinkedList1();
        // LinkedList1 list2 = new LinkedList1();
        // list1.add("Sayan2");
        // list1.add("sayan1");

        // list1.printList();
        // list1.addlast("sayan3");
        // list1.printList();
        // list1.add("Sayan0");
        // list1.printList();

        // list1.deletefirst();
        // list1.printList();
        // list1.deleteLast();
        // list1.printList();
        // System.out.println(list1.getSize());

        list1.addlast(1);
        list1.addlast(2);
        list1.addlast(2);
        list1.addlast(4);
        list1.addlast(5);
        list1.addlast(6);
        list1.addlast(7);
        list1.addlast(8);
        list1.printList();
        // System.out.println();

        // list2.addlast(1);
        // list2.addlast(2);
        // list2.addlast(2);
        // list2.addlast(1);

        // list1.reverseI();
        // list1.insert("kartik", 2);
        // list1.printList();

        // list1.delete(2);
        // list1.printList();
        // list1.insertRec(10, 2);
        // list1.printList();

        // list1.duplicates();
        // list1.printList();

        // LinkedList1 ans = LinkedList1.merge(list1, list2);
        // ans.printList();

        // System.out.println(list1.isCycle());
        // System.out.println(list1.lengthCycle());

        // System.out.println(list1.isHappy(100));
        // System.out.println(list2.middle());
        // list1.bubblesort();
        // list1.printList();
        // System.out.println(list1.getSize());

        // head = list1.reverseR(head);
        // list1.printList();
        // head = list1.reverseBetween(head, 2, 5);
        // list1.printList();
        // System.out.println(list1.isPalindrome(head));
        // list1.ReOrder(head);
        // list1.printList();
        head = list1.reverseKNode(head, 4);
        list1.printList();

        // head = list1.reverseAlternateKNode(head, 2);
        // list1.printList();

        // head = list1.rotateleft(head, 2);
        // list1.printList();

    }
}
