import org.w3c.dom.Node;

public class InterviewQuestions {
    public static void main(String[] args) {

    }

    // to cheack wheather a cycle is present or not;
    public boolean hascycle(Node head) {
        Node fast = head;
        Node small = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            small = small.next;

            if (fast == small) {
                return true;
            }
        }
        return false;
    }

    // to find the length of the cycle;
    public int lengthcycle(Node head) {
        Node fast = head;
        Node small = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            small = small.next;

            if (fast == small) {

                Node temp = small;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != small);
                return length;
            }
        }
        return 0;
    }

    // to reverse the linkedlist;
    public Node reverse(Node head) {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node current = head;
        Node next = current.next;
        while (current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    // to reverse a part(range) of a linkedlist;
    public Node reversebtw(Node head, int left, int right) {
        if (left == right) {
            return head;
        }
        Node current = head;
        Node prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        Node fast = prev;
        Node newEnd = current;

        Node next = current.next;
        // reversing the range;
        for (int i = 0; current != null && i < right - left + 1; i++) {

            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (fast != null) {
            fast.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }

    public Node middle(Node head) {
        if (head == null) {
            return head;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // merge the two given linkedlist;
    public static LL merge(LL first, LL second) {
        Node f = first.value;
        Node s = second.value;

        LL ans = new LL();
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertlast(f.value);
                f = f.next;

            } else {
                ans.insertlast(s.value);
                s = s.next;
            }

        }
        while (f != null) {
            ans.insertlast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertlast(s.value);
            s = s.next;
        }
        return ans;
    }

}