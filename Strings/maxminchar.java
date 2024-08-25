import java.util.HashMap;
import java.util.Map;

public class maxminchar {
    public static void main(String[] args) {
        String str = "grass is greener on the other side";

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        char minChar = '0';
        char maxChar='0';

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++) {
          char ch = str.charAt(i);
          if (Character.isLetter(ch)) {
              map.put(ch,map.getOrDefault(ch,0)+1);
          }
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()) {
            int currValue = entry.getValue();
            char currChar = entry.getKey();
            if(currValue < min){
                min = currValue;
                minChar = currChar;
            }

            if(currValue > max){
                max = currValue;
                maxChar = currChar;
            }
        }

        System.out.printf("minchar=>"+ minChar + "=>" + min);
        System.out.println();
        System.out.println("*******************************");
        System.out.printf("maxchar=>"+ maxChar + "=>" + max);
    }

}
