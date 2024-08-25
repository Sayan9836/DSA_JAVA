public class P32 {
    public static void main(String[] args) {
        int n=15;
        int[] arr=new int[20];
        int idx=0;
        while (n>=1) {
            int rem=n%2;
            arr[idx++]=rem;
            n/=2;
        }
        for(int i=idx-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}




