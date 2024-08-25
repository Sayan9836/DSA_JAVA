public class odd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
       // for (int i = 1; i <= arr.length - 1; i = i + 2) {
           // System.out.println(arr[i] + "");// Elements in odd position;
        //}
        for (int element:arr) {
            if(element%2!=0)
            System.out.println(element);// Elements in odd position;
        }
    }
}
