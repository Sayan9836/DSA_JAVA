public class P31 {
   public static void main(String[] args) {
      String given="C9";
      int sum=0;
      int inc=0;
      String a="0123456789ABCDEF";

      for(int i=given.length()-1;i>=0;i--){
         char ch=given.charAt(i);
         int val=a.indexOf(ch);
         sum+=Math.pow(16,inc++)*val;
      }
      System.out.println(sum);

   }
}
