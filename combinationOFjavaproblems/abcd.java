public class abcd {
    public static void main(String[] args) {
        int[] nums = { 12, 12345, 1234, -2314, 2, 324 };
        System.out.println(findDigit(nums));
    }

    static int findDigit(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int RD = digit1(num);
        return RD % 2 == 0;

    }

    static int digit1(int num) {
        if (num < 0) {
            return num * -1;
        }
        if (num == 0) {
            return 0;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;

    }
}
