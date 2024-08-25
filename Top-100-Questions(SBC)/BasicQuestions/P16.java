public class P16 {
    public static void main(String[] args) {
        int n=2331;
        int temp=n;
        int sum=0;
        while (n>0) {
           sum=sum*10+n%10;
           n/=10; 
        }
        if (sum==temp) {
            System.out.println("Yes palindrome");
        }else{
            System.out.println("Not a Palindrome no");
        }
    }
}
