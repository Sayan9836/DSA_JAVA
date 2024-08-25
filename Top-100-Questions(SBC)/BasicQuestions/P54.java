import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P54 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,5,4,3,2,6,7,2,1,1,2,1};
     HashMap<Integer,Integer>map=new HashMap<>();
     TreeMap<Integer,Integer>map1=new TreeMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
     for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        // System.out.print(entry.getKey()+" ");
         map1.put(entry.getValue(), entry.getKey());
     }

     for(Map.Entry<Integer,Integer>tree:map1.entrySet()){
        System.out.print(tree.getValue()+" ");
     }
    }
}
