import java.util.HashMap;

public class longestSubstring {
    public static void main(String[] args) {
        String str = "aabacbebebee";
        int n = 3;
        System.out.println(UniqueCharacter(str, n));
    }

    static int UniqueCharacter(String s, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < s.length()) {
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.size() == n) {
                max = Math.max(max, end - start + 1);
            }

            if (map.size() > n) {
                while (map.size() > n) {
                    char newch = s.charAt(start);
                    map.put(newch, map.get(newch) - 1);
                    if (map.get(newch) == 0) {
                        map.remove(newch);
                    }
                    start++;
                }
            }
            end++;
        }
        return max;
    }
}
