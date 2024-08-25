import java.util.*;
public class a41 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.next();

      char[] arr = str.toCharArray();
      for(int i = 0;i<arr.length;i++){
        if(arr[i] == '#'){
            // swap(arr, start, i);
            for(int j=i;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = '#';
        }
      }
      System.out.println(new String(arr));
    }


    static void swap(char[] arr,int i,int j){
        char  temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp;
    }
}
