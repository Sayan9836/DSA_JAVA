public class s4 {
    public static void main(String[] args) {
        String str = "sayias";
        boolean flag = false;
        for(int i=0;i<str.length() /2 ; i++){

            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                flag = true;
            }
        }

        if (flag == true) {
            System.out.println("not palindrome");
        }else{
            System.out.println("Palindrome");
        }
    }
}
