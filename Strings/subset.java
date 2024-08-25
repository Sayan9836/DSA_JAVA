public class subset {
    public static void main(String[] args) {
        String str = "abcd";
        int len = str.length();
        String[] arr = new String[(len * (len + 1)) / 2];
        int temp = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <=len; j++) {
                arr[temp] = str.substring(i, j);
                temp++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
