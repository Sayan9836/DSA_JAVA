public class P55 {
    public static void main(String[] args) {
        String str = "abc";

        permutation("", str);
    }

    
    static void permutation(String ans, String str) {
        if (str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            String left=str.substring(0, i);
            String right=str.substring(i+1);
            String remainingStr=left+right; 
            permutation(ans+ch, remainingStr);
        }  
    } 
}