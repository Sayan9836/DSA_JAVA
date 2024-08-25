public class P46 {
    public static void main(String[] args) {
        int[] arr={105,209,13,40,5,6};
        int min=Integer.MAX_VALUE;
        for(int a:arr){
            min=Math.min(a,min);
        }
      System.out.println(min);      
    }
}
