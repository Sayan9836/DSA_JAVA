import java.util.HashMap;

public class P35 {
    // public static void main(String[] args) {
    //     int n=347;

    //     int Dec=OctalToDecimal(n);
    //     int binary=DecimalToBinary(Dec);
    //     System.out.print(binary);
    // }

    // static int OctalToDecimal(int n){
    //   int inc=0;
    //   int sum=0;
    //   while (n>0) {
    //     int temp=n%10;
    //     sum+=Math.pow(8,inc++)*temp;
    //     n/=10;
    //   }
    //   return sum;
    // }

    // static int DecimalToBinary(int n){
    //      int[] arr=new int[20];
    //      int idx=0;
    //     while (n>=1) {
    //         int rem=n%2;
    //         arr[idx++]=rem;
    //          n/=2;
    //     }
    //      int sum=0;
    //     for(int i=idx-1;i>=0;i--){
    //        sum=sum*10+arr[i];
    //     }
    //     return sum;
    // }

    /*******************Efficient-Solution************************************** */

    public static void main(String[] args) {
        int n=347;
        HashMap<Integer,String>map=new HashMap<>();

        map.put(0,"000");;
        map.put(1,"001");
        map.put(2,"010");
        map.put(3,"011");
        map.put(4,"100");
        map.put(5,"101");
        map.put(6,"110");
        map.put(7,"111");

        String result="";
        while (n>0) {
            int rem=n%10;
            result=map.get(rem)+result;
            n/=10;
        }
        System.out.println(result);
    }
    
}
