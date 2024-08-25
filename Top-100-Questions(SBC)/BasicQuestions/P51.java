import java.util.Arrays;

public class P51 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,20,3,4,5,6};
        int n=arr.length;
        int temp[]=new int[n/2];
        for(int i=0;i<n/2;i++){
            temp[i]=arr[i];
        }

        Arrays.sort(temp);
        for (int i = 0; i < n/2; i++) {
            arr[i]=temp[i];
        }
        int idx=0;
        for(int i=n/2;i<n;i++){
            temp[idx++]=arr[i];
        }
        Arrays.sort(temp);
        idx=1;
        for(int i=n/2;i<n;i++){
            arr[i]=temp[temp.length-idx++];
        }

        System.out.println(Arrays.toString(arr));

    }
}
