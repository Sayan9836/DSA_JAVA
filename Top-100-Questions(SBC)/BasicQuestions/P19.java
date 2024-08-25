public class P19 {
    
    public static void main(String[] args) {
        int n=16;
        boolean flag=false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                flag=true;
                System.out.println("Not a Prime No");
                break;
            }
        }
        if (flag==false) {
            System.out.println("Prime No");
        }
    }
}
