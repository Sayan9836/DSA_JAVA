public class P33 {
    public static void main(String[] args) {
        int n=148;
        int arr[]=new int[20];
        int idx=0;
        while (n>=1) {
            int rem=n%8;
            arr[idx++]=rem;
            n/=8;
        }

        for(int i=idx-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
