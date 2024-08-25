public class S1 {
    public static void main(String[] args) {
        // System.out.println(remove_app("bacapplecdah"));
        System.out.println(remove_app("bacapplecdah"));
    }

    // static void remove_a(String ans, String str) {

    // if (str.isEmpty()) {
    // System.out.println(ans);
    // return;
    // }

    // char ch = str.charAt(0);
    // if (ch == 'a') {
    // remove_a(ans, str.substring(1));
    // } else {
    // remove_a(ans + ch, str.substring(1));
    // }

    // }
//********************************************************************** */
    // static String remove_a(String str) {

    // if (str.isEmpty()) {
    // return "";
    // }

    // char ch = str.charAt(0);
    // if (ch == 'a') {
    // return remove_a(str.substring(1));
    // }
    // return ch + remove_a(str.substring(1));
          
    // }
//**************************************************************************** */
    // static String remove_apple(String str) {

    // if (str.isEmpty()) {
    // return "";
    // }

    // if (str.startsWith("apple")) {
    // return remove_apple(str.substring(5));
    // }
    // return str.charAt(0) + remove_apple(str.substring(1));

    // }

//*************************************************************************************** */
    //  remove app when it is not apple
    static String remove_app(String str) {

        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return remove_app(str.substring(3));
        }
        return str.charAt(0) + remove_app(str.substring(1));

    }
 }
 