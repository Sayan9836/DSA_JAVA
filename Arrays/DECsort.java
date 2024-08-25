import java.util.Arrays;

public class DECsort {
    public static void main(String[] args) {
        int[] arr={5,6,2,4,1,7};
        DECsort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

   static void sort(int[] arr){
        int temp=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
       
       
    }
}
