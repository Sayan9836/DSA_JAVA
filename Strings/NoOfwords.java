public class NoOfwords {
    public static void main(String[] args) {
        String str = "sayan is a good boy";
        String[] word = str.split(" ");
        int count = 0;
        // System.out.print(word.length);
        for (int i = 0; i < word.length; i++) {
            count++;

        }
        System.out.println(count);
    }
}
