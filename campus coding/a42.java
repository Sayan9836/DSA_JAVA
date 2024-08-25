import java.util.*;
public class a42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p= sc.nextInt();
        int sum = 0;
        for(int i=1;i<=p;i++){
            sum+=n*i;
        }

        System.out.println("The Average is "+ (double)sum/p);
    }
}
