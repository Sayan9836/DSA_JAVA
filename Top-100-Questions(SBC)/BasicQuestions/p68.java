import java.util.Arrays;

public class p68 {
    public static void main(String[] args) {
        int[] arr={-1,0,3,1,-4};
        
        int start=0;
        int temp=0;

        while(temp<arr.length){
            if (arr[temp]>=0) {
                temp++;
            }else if (arr[temp]<0) {
                int random=arr[start];
                arr[start]=arr[temp];
                arr[temp]=random;
                start++;
                temp++;
            }
               
            System.out.println(Arrays.toString(arr));
            
        }
    }
}
