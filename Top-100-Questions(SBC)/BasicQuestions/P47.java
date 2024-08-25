public class P47 {
    public static void main(String[] args){
        int[] arr={10,209,13,40,5};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int a:arr){
            max=Math.max(a,max);
            min=Math.min(min,a);
        }
       System.out.println(max);
       System.out.println(min);      
    }
}
