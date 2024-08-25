public class s2 {
    public static void main (String[] args) {
        String str = "SaYaN";
        String ans = "";
        for (char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)) {
                ans+=Character.toLowerCase(ch);
            }else{
                ans+=Character.toUpperCase(ch);
            }
        }

        System.out.println(ans);
    }
}
