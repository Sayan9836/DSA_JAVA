public class p64 {
    public static void main(String[] args) {
        String str = "this is the number";
        String replacedStr = "the";

        str = str.replaceAll("the", "");
        str=str.replace("  "," ");
        System.out.println(str);
    }   
}       
