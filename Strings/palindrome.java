public class palindrome {
    public static void main(String[] args) {

        String str = "abba";
        char[] str1 = str.toCharArray();
        // String[] s = new String[str.length()];
        int start = 0;
        int end = str1.length - 1;
        boolean flag = true;

        while (start < end) {

            if (str1[start] == str1[end]) {

                char temp = str1[start];
                str1[start] = str1[end];
                str1[end] = temp;
                start++;
                end--;
            } else {
                flag = false;
                System.out.println("Not a palindrome string");
                break;

            }

        }
        for (char element : str1) {
            System.out.print(element + " ");

        }
        System.out.println("\n");
        if (flag == true) {
            System.out.println("palindrome String");
        }

    }

}
