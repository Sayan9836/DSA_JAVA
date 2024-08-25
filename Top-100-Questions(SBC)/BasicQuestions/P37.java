

public class P37 {
    public static void main(String[] args) {
       int n=5;
       int r=3;
       int ans= fact(n)/fact(n-r);    
       System.out.println(ans);                                                                                                      
    }

   static int fact(int f){
        if(f==0){
            return 1;
        }
        return f*fact(f-1);
    }
}

