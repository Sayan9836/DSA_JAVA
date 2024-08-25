public class P29 {
    // public static void main(String[] args) {
    //     String a="10110";
    //     int ans=DecimalConverter(a);
    //     System.out.println(ans);
    // }

    // static int DecimalConverter(String a){
    //     int len=a.length();
    //     int sum=0;
    //     for(int i=0;i<a.length();i++){
    //         len=len-1;
    //         sum+=(int)Math.pow(2, len)*(a.charAt(i)-'0');
    //     }
    //     return sum;
    // }
    /***********************ANOTHER WAY*********************** */
    public static void main(String[] args){
        int n=10010;
        int inc=0;
        int sum=0;
        while(n>0){
            int last=n%10;
            sum+=Math.pow(2,inc++)*last;
            n/=10;
        }
        System.out.println(sum);
    }
 
}
