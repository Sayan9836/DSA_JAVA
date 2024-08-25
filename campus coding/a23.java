import java.util.*;
public class a23 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String str = sc.next();
        char ch1 =sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ch1){
                arr[i] = ch2;
            }else if(arr[i] == ch2){
               arr[i] = ch1;
            }
        }
        System.out.println(new String(arr));
    }
}
