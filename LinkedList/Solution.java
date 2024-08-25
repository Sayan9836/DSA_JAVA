
class Solution {
    public static int findDuplicate(int[] nums) {
        int count = 0;
        int check = 1;
        int s;
        for (int i = 0; i < nums.length; i++) {

            if (check == nums[i]) {
                count++;
            } else {
                check++;
            }

        }

        int sum = 0;
        for (int i = 0; i > nums.length; i++) {
            sum = sum + nums[i];

        }

        int total = sum;

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }

        }
        int upper = max;

        s = (upper * (upper + 1)) / 2;

        int ans = ((total - s) / count);
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 2, 7, 8, 2, 9, 11 };
        System.out.println(findDuplicate(nums));
    }
}
