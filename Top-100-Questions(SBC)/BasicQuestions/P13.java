public class P13 {
    public static void main(String[] args) {
        int n=10;
        int first=0,second=1;
        System.out.print(first+" ");
        System.out.print(second+" ");
        for(int i=3;i<=n;i++){
            int next=first+second;
            first=second;
            second=next;
            System.out.print(next+" ");
        }
    }
}





