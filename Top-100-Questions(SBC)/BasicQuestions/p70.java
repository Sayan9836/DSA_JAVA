public class p70 {
    public static void main(String[] args) {
        int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};
        // int res=0;
        // for (int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++){
        //         sum+=arr[j];
        //         res=Math.max(res,sum);
        //     }
        // }
        // System.out.println(res);

        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];
            if(max_sum<curr_sum){
                max_sum=curr_sum;
            }
            if (curr_sum<0) {
                curr_sum=0;
            }
        }

        System.out.println(max_sum);
        
    }
}
