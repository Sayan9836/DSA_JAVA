public class p62 {
    public static void main(String[] args){
      String str="abcd efgh ijkl";
      String[] words=str.split(" ");
      String newStr="";
      for(String s:words){
        String firstchar=s.substring(0, 1);
        String restchar=s.substring(1, s.length()-1);
        String lastchar=s.substring(s.length()-1,s.length() );

        newStr+=firstchar.toUpperCase()+restchar+lastchar.toUpperCase()+" ";
      }
      System.out.println(newStr);
    }
}