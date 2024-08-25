public class P14 {
   public static void main(String[] args) {
      int ini = 10;
      int fin = 1000;
      for (int i = ini; i <= fin; i++) {
         if (isArmsStrong(i)) {
            System.out.println(i);
         }
      }
   }

   static boolean isArmsStrong(int n) {
      int temp = n;
      int sum = 0;
      while (n > 0) {
         int rem = n % 10;
         sum += Math.pow(rem, 3);
         n /= 10;
      }
      if (temp == sum) {
         return true;
      }
      return false;
   }
}
