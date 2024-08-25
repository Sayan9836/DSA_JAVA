public class P45 {
    public static void main(String[] args) {
        int[] arr={1,209,13,40,5};
        int max=Integer.MIN_VALUE;
        for(int a:arr){
            max=Math.max(a,max);
        }
      System.out.println(max);      
    }
}
