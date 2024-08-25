import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class a5 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt();
       Character[] arr = new Character[n];

       for(int i=0;i<n;i++){
        arr[i] = sc.next().charAt(0);
       }


       HashMap<Character,Integer> map = new HashMap<>();
       for(Character c : arr){
        map.put(c,map.getOrDefault(c,0)+1);
       }
       boolean flag = false;
       for(Map.Entry<Character,Integer> entry : map.entrySet()){
        if (entry.getValue() % 2 !=0) {
            flag = true;
            System.out.println(entry.getKey());
            break;
        }
       }
       if (!flag) {
        
           System.out.println("All are even");
       }

       
    }
}
