public class p66 {
    public static void main(String[] args) {
       int arr[]={1,0,0,1,2,0,1,2,1,0,2,1,0,1};

       int start=0;
       int end=arr.length-1;
       int mid=0;
       while(mid<=end){
        if(arr[mid]==0){
            int temp=arr[mid];
            arr[mid]=arr[start];
            arr[start]=temp;
            mid++;         
            start++;      
        }
        else if (arr[mid]==1) {
            mid++;
        }else if(arr[mid]==2){
            int temp=arr[mid];
            arr[mid]=arr[end];
            arr[end]=temp;
            end--;
        }
       }

      for (int i : arr) {
        System.out.print(i+" ");
      }
    }

}