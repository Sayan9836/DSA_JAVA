import java.util.HashMap;

public class allUniqueSub {
    public static void main(String[] args) {
        String str = "aabacbebebe";
        System.out.println(Uniquesubstring(str));
    }

    static int Uniquesubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < s.length()) {
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
       
            if (map.size() == end - start + 1) {
                max = Math.max(max, end - start + 1);
            }
                                                                                                            
           else if (map.size() < end - start + 1) {
                while (map.size() < end - start + 1) {
                    char newchar = s.charAt(start);
                    map.put(newchar, map.get(newchar) - 1);
                    if (map.get(newchar) == 0) {
                        map.remove(newchar);
                    }
                    start++;
                }

            }
            end++;
        }
        return max;
    }
}
