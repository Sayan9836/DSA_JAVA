

public class duplicate {
    public static void main(String[] args) {
       
        int[] arr={1,2,2,2,3,4,5,6,6};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+"");
                    break;
                }
            }
        }
        
    }
}
