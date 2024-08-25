public class P58 {
    public static void main(String[] args) {
        String s="$P*r;e..pi,  ns'ta^?";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch<'A'||ch>'Z'&& ch<'a'||ch>'z'){
                s=s.substring(0,i)+s.substring(i+1);
                i--;
            }
        }
        System.out.println(s);
    }
}
