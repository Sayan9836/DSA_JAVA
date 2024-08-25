public class P22 {
    public static void main(String[] args) {
       int a=10,b=152,c=39,d=42;

       if(a>b&&a>c){
        System.out.println("a is greatest");
       }else if(b>a&&b>c){
        System.out.println("b is greatest");
       }else{
        System.out.println("c is the greatest");
       } 
                                                                           
       System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
    }
}
