
import java.util.ArrayList;

public class S3 {

    public static void main(String[] args) {
        String str = "7596889279";
        ArrayList<String> list = new ArrayList<>();
        phcombination("", str, list);
        System.out.println(list);
        // ArrayList<String> list1 = new ArrayList<>();
        // int target = 4;
        // dicethrow("", target, list1);
        // System.out.println(list1);
    }

    // phone Letter combination
    static void phcombination(String ans, String str, ArrayList<String> list) {
        if (str.isEmpty()) {
            list.add(ans);
            return;
        }

        int digit = str.charAt(0) - '0';
        int i = (digit - 2) * 3;
        if(digit > 7){
            i+=1;
        }
        int len=i+3;
        if(digit == 7 || digit == 9){
            len+=1;
        }
        for (; i < len; i++) {
            char ch = (char) ('a' + i);
            phcombination(ans + ch, str.substring(1), list);
        }
    }

    // dice trow

    static void dicethrow(String ans, int target, ArrayList<String> list1) {
        if (target == 0) {
            list1.add(ans);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dicethrow(ans + i, target - i, list1);
        }
    }

}
