public class P44 {
    public static void main(String[] args) {
        int n = 147;
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();

        String[] single__digit = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] double__digit = { "", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eightteen", "nineteen" };
        String[] tens__multiple = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eightty",
                "ninety" };
        String[] tens__power = { "hundread", "thousand" };

        int len = arr.length;
        int x = 0;

        if (len == 1) {
            System.out.print(single__digit[arr[0] - '0']);
        }

        while (x < arr.length) {
            if (len >= 3) {
                System.out.print(single__digit[arr[x] - '0'] + " ");
                System.out.print(tens__power[len - 3] + " ");
                len--;
                x++;
            } else {
                int i = (arr[x] - '0');
                if (i == 1) {
                    int sum = arr[x] - '0' + arr[x + 1] - '0';
                    System.out.print(double__digit[sum]);
                    break;
                }

                else {
                    if (i != 0) {
                        System.out.print(tens__multiple[i] + " ");
                    }
                    x++;
                    i = (arr[x] - '0');
                    if (i != 0) {
                        System.out.print(single__digit[i] + " ");
                    }

                }

            }

        }
    }
}
