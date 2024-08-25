import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Sayan");
        list.add("ayan");
        list.addLast("sayan3");
        list.addFirst("som");
        list.add("sayank");

        System.out.println(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ->");
        }
        // System.out.println(list);
    }
}
