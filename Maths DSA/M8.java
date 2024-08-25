public class M8 {
    // to calculate power of a number
    public static void main(String[] args) {
        // int base = 2;
        // int power = 4;
        // int ans = 1;
        // while (power > 0) {
        //     if ((power & 1) == 1) {
        //         ans *= base;
        //     }
        //     base *= base;
        //     power = power >> 1;
        // }
        // System.out.println(ans);

        int base = 3;
        int power = 3;
        int ans =1;
        while(power > 0){
            if((power & 1) == 1){
                ans=ans*base;
            }
            base*=base;
            power =  power >>1;
        }
        System.out.println(ans);
    }
}
