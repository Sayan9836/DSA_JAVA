public class P26 {
    public static void main(String[] args) {
        int ans=HCF(10,78);
        System.out.println(ans);
    }

   static int HCF(int a,int b){
      if (a==0) {
        return b;
      }
                                                                                     
      return HCF(b%a,a);
    }
}
