import java.util.*;
public class a35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of pizza bought:");
        int a = sc.nextInt();
        System.out.print("Enter the no of puffs bought:");
        int b = sc.nextInt();
        System.out.print("Enter the no of cool drinks bought:");
        int c = sc.nextInt();

       int total = 100*a + 20*b + 10*c;
       System.out.println();
       System.out.println("Bill Details\n");
       System.out.println("No of pizzas:"+a);
       System.out.println("No of puffs:"+b);
       System.out.println("No of cooldrinks:"+c);
       System.out.println("Total price="+total);
    }
}
