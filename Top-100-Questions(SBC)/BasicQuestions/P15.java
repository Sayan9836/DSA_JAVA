public class P15 {
    public static void main(String[] args) {
        int no=154;  
        int temp=no;      
        int sum=0; 
        while (temp>0) {
            int rem=temp%10;
            sum+=(rem*rem*rem);
            temp/=10;
        }
        if(no==sum){
            System.out.println("ArmsStrong No");
        }else{
            System.out.println("Not a ArmsStrong No");
        }

    }
}
