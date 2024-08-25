
import java.util.HashMap;
import java.util.Map;

public class collectionsMapH1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Amit");// putting element into the map;
        map.put(2, "Vijay");
        map.put(3, "apple");
        map.put(1, "Grapes"); // trying duplicate key

        for (Map.Entry<Integer, String> k : map.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }
        System.out.println("************");

        map.putIfAbsent(4, "germany");

        for (Map.Entry<Integer, String> k : map.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }
        System.out.println("***********");

        map.remove(2);

        for (Map.Entry<Integer, String> k : map.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }
        System.out.println("**************");

        map.replace(3, "nokia");

        System.out.println(map);

        map.replaceAll((k, v) -> "Sayan");// replace all the elements with Sayan;

        System.out.println("*************");

        for (Map.Entry<Integer, String> k : map.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }

    }

}
// if the key is same the value will replace;
// HashMap is the implementation of Map, but it doesn't maintain any order
// HashMap<K,V>, where K stands for key and V for value. It inherits the
// AbstractMap class and implements the Map interface.

// *** HashSet contains only values whereas HashMap contains an entry(key and value).