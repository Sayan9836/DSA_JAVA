
public class reveword {
    public static void main(String[] args) {
        String str = "java is a good programing language";
        String[] word = str.split(" ");
        String rev = "";
        // String[] rev = new String[word.length];
        // int temp = 0;
        for (int i = 0; i < word.length; i++) {
            // rev[temp] = word[word.length - i - 1];
            // temp++;
            // rev += word[word.length - i - 1] + " ";
            rev = word[i] + " " + rev;

        }
        System.out.println(rev);
        // System.out.println(Arrays.toString(rev));

    }
}
