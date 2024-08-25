public class even {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
       // for(int i=0;i<arr.length;i=i+2){


        //System.out.println(arr[i]+"");//  elements in even position;

       // }
        for(int element:arr){

            if(element%2==0)
            System.out.println(element);// even elements in an array;

        }
    }
}
