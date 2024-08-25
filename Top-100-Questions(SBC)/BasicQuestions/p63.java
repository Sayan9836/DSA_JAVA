import java.util.HashMap;
import java.util.Map;

public class p63 {
    public static void main(String[] args){
        String str="aaabngdbvgnbm";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1 );

        }   
        for(Map.Entry<Character,Integer> entry: map.entrySet())  {
            System.out.print(entry.getValue()+" ");
        }  
    }
}
