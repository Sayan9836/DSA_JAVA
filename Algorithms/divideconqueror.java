
public class divideconqueror {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 23, 3, 1, 6, 7, 21, 8 };
        pair p = new pair(Integer.MIN_VALUE, Integer.MAX_VALUE);
        p = findmaxmin(arr, 0, arr.length - 1, p);
        System.out.println(p.min);
        System.out.println(p.max);
    }

    public static pair findmaxmin(int[] arr, int l, int r, pair p) {

        // if there is only one element in the list;
        if (l == r) {
            p.max = Math.max(p.max, arr[l]);
            p.min = Math.max(p.min, arr[r]);
            return p;
        }

        // if there is two elements in the list;
        if (r - l == 1) {
            if (arr[l] > arr[r]) {
                p.max = Math.max(p.max, arr[l]);
                p.min = Math.min(p.min, arr[r]);

            } else {
                p.max = Math.max(p.max, arr[r]);
                p.min = Math.min(p.min, arr[l]);
            }
            return p;
        }

        // dividing the array recurssively;
        int mid = l + (r - l) / 2;

        p = findmaxmin(arr, l, mid, p);
        p = findmaxmin(arr, mid + 1, r, p);

        return p;
    }
}

class pair {
    int max;
    int min;

    pair(int max, int min) {
        this.max = max;
        this.min = min;
    }
}
