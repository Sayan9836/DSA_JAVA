
public class LarSmallword {
    public static void main(String[] args) {
        String str = "buh time bug left time pass ti left lawra timeewwg";
        String[] words = str.split(" ");
        String small = " ", large = " ";

        /*
         * /for (int i = 0; i < str.length(); i++) {
         * if(str.charAt(i)!=' '){
         * word += str.charAt(i);
         * }
         * 
         * }
         */
        small = large = words[0];
        for (int k = 1; k < words.length; k++) {
            if (small.length() > words[k].length()) {
                small = words[k];
            } 

            if (large.length() < words[k].length()) {
                large = words[k];
            }

        }
        System.out.println(small);
        System.out.println(large);

    }
}
