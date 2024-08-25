public class P27 {
    public static void main(String[] args) {
        int a=10,b=25;

        for(int i=Math.max(a,b);i<=a*b;i+=Math.max(a,b)){
            if(i%a==0&&i%b==0){
                System.out.println(i+" is the lcm of the given no");
                break;
            } 
        }

        // LCM=a*b/HCF;
    }

    
}
