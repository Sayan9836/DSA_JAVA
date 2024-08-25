public class P60 {
    public static void main(String[] args) {
        String s= "(a+b)=]c";
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('|| ch==')'|| ch=='['||ch==']'|| ch=='{'||ch=='}'){
                continue;
            }
            ans+=ch;
        }
        System.out.println(ans);
    }
}
 