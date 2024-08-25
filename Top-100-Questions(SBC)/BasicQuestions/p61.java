public class p61 {
    public static void main(String[] args){
        String str="123459";
        int sum=0;
        for(int i=0;i<str.length();i++){
          sum=sum*10+str.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
