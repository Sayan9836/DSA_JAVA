public class generics4 {
    public static <E> void printarray(E[] elements) {// generic method it accept any type of argument;
        for (E element : elements) {
            System.out.print(element);

        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Integer[] IntArray = { 1, 2, 3, 4, 5 };
        Character[] CharArray = { 'A', 'B', 'C', 'D' };
        String[] stringArray = { "satab", "hgahgab", "hagan" };
        printarray(IntArray);
        printarray(CharArray);
        printarray(stringArray);
    }

}
