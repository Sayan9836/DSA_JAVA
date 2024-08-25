public class trim {
    public static void main(String[] args) {
        /*
         * / String s1 = " sayan  maity ";
         * System.out.println(s1.length());
         * System.out.println(s1.trim());
         * s1 = s1.trim();
         * System.out.println(s1.length());
         * 
         * System.out.println(s1);
         */
        /*
         * String s1 = " sayan is a good boy ";
         * s1 = s1.replaceAll("\\s+", "");//using regex;
         * System.out.println(s1);/
         */
        String s1 = " once upon a time ";
        char ch = '-';
        s1 = s1.replace(' ', ch);
        System.out.println(s1);
    }
}


