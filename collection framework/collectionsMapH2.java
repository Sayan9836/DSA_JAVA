import java.util.HashMap;
import java.util.Map;

public class collectionsMapH2 {
    public static void main(String[] args) {
        HashMap<Integer, Book> map = new HashMap<>();

        Book b1 = new Book(13, 650, "Let Us C", "shyam lal", 3);
        Book b2 = new Book(21, 500, "maths for everyOne", "K Chand", 8);
        Book b3 = new Book(33, 650, "Science of Mind", "RD Sharma", 4);

        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        // Traversing the map
        for (Map.Entry<Integer, Book> entry : map.entrySet()) {
            Book b = entry.getValue();
            System.out.println(entry.getKey() + " " + "details:");

            System.out.println(b.id + " " + b.price + " " + b.name + " " + b.author + " " + b.quantity);
            System.out.println();

        }
    }
}

class Book {
    int id;
    int price;
    String name, author;
    int quantity;

    Book(int id, int price, String name, String author, int quantity) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
}

// What is Hashing?
// It is the process of converting an object into an integer value.
// The integer value helps in indexing and faster searches.
// HashMap contains an array of the nodes, and the node is represented as class.
// It uses an array and LinkedList data structure internally for storing Key and Value.
// Index = hashcode(Key) & (n-1)
// if there are two or more same key,the index value will same;