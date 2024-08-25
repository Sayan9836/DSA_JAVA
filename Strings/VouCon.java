public class VouCon {
    public static void main(String[] args) {
        String str = "sayanegifoguf";
        str = str.toLowerCase();
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            } else {
                count2++;
            }
        }
        System.out.println(count);
        System.out.println(count2);
    }
}
