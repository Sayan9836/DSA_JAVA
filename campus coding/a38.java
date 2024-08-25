public class a38 {
  public static void main(String[] args) {
    int n = 15;

    for(int i=3;i>=0;i--){
        System.out.print((n>>i)&1);
    }
  }
}
