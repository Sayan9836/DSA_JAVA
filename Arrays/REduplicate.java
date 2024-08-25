public class REduplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4,4,4, 5, 6 };
        
        int[] temp= new int[arr.length];
        int idx=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                arr[idx++] = arr[i];
            }
        }
        arr[idx++] = arr[arr.length-1];
        // temp[idx++] = arr[arr.length-1];
        for (int i = 0; i <idx; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
