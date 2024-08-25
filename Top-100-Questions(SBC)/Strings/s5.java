public class s5 {
    public static void main(String[] args) {
        String str = "saya0)n2745nd,hd,*&^";

        String numbers = "12345";
        int sum = 0;
        for( int i = 0; i< numbers.length();i++){
            sum+=numbers.charAt(i) - '0';
        }

        System.out.println(sum);

        StringBuilder sb = new StringBuilder();


        for(char ch : str.toCharArray()){
            if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());

    }
}
