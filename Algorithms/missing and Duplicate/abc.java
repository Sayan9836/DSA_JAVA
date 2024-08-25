public class abc {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        System.out.println(minJumps(arr));
    }

    static int minJumps(int[] arr) {
        if (arr[0] == 0) {
            return -1;
        }
        int count = 0, i = 0, l1 = 0;
        while (i < arr.length) {

            int temp = arr[i];
            l1 = i + temp;
            if (i + 1 >= arr.length) {
                break;
            }
            if (temp >= 1) {
                for (int j = i + 1; j < l1 && j < arr.length; j++) {
                    if (arr[j] == 0) {
                        if (count == 0) {
                            return -1;
                        }
                        return count;

                    }

                }
            }
            if (l1 < arr.length && arr[l1] == 0) {
                return count + 1;
            }

            count += 1;
            i = l1;
        }
        return count;
    }
}
