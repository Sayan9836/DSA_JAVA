import java.util.Arrays;

public class P48 {
    public static void main(String[] args){
        int[] arr={1,2,6,3,8};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}