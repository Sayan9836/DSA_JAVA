public class divideEqual {
    public static void main(String[] args) {
        String str = "aaaabbbbcccc";
        int len = str.length();
        int n = 4;
        int b = len / n;
        String[] newstString = new String[n];
        int temp = 0;

        if (len % n != 0) {
            System.out.println("not possible to divide the string");
        } else {
            // System.out.println(str.substring(0, len / n));
            // System.out.println(str.substring(len / n, len / n + len / n));
            // System.out.println(str.substring(len / n + len / n, len / n + len / n + len /
            // n));
            // System.out.println(str.substring(len / n + len / n + len / n, len / n + len /
            // n + len / n + len / n));
            for (int i = 0; i < str.length(); i = i + b) {
                String part = str.substring(i, i + b);
                newstString[temp] = part;
                temp++;
            }
        }
        for (int i = 0; i < newstString.length; i++) {
            System.out.println(newstString[i]);
        }
    }
}
