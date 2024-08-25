public class largest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int max=arr[0];
        int idx=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                idx=i;
            }

        }
        System.out.println(max+" "+idx);
    }
}
