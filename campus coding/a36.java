import java.util.*;
public class a36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        int l = sc.nextInt();
        System.out.println("Enter the distance covered");
        int d = sc.nextInt();

        if(l<0 || d<0){
            if(l<0){
            System.out.println(l+"is an Invalid Input");
            }else if(d<0){
            System.out.println(d+"is an Invalid Input");
            }
        }
        double lt = l*1.00;
        double dis = d*1.00;

        double Lk = (lt/dis)*100;
        System.out.println("Liters/100KM");
        System.out.printf("%.2f\n",Lk);
        double dM = dis*0.6214;
        double FG = lt*0.2642;
        double MG = dM / FG;
        System.out.println("Miles/gallons");
        System.out.printf("%.2f",MG);
    }
}
