public class s1 {
   public static void main(String[] args) {
     char ch = 'A';
     String vowel = "aeiouAEIOU";

     if (vowel.contains(Character.toString(ch))) {
        System.out.print(ch + " " + "is" + " " + "vowel");
     }else{
        if (Character.isLetter(ch)) {
            System.out.print(ch + " " + "is" + " " + "consonent");
        }else{
            System.out.println("INVALID INPUT!!");
        }
     }
   }
}