public class relacelower {
    public static void main(String[] args) {
        String s = "SAayaRNmsh";
        // char[] b = s.toCharArray();
        /*
         * /for (int i = 0; i < s.length(); i++) {
         * if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
         * char str = s.charAt(i);
         * char cbs = (char) (str + 32);
         * System.out.println(cbs);
         * 
         * } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
         * char str1 = s.charAt(i);
         * char ded = (char) (str1 - 32);
         * System.out.println(ded);
         * }/
         */

        StringBuffer newstr = new StringBuffer(s);
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {

                newstr.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            } else if (Character.isLowerCase(s.charAt(i))) {
                newstr.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }

        }
        System.out.println(newstr.toString());

    }
}
