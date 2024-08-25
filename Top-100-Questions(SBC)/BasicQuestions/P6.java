public class P6 {
    public static void main(String[] args) {
        int n=15;
        if (isPerfectSquare(n)) {
            System.out.println("Yes, it is a perfect Square");
        }else{
           System.out.println("No,it is not a Perfect Square");
        }
        //***************************************** */

        if (Math.floor(Math.sqrt(n))==Math.ceil(Math.sqrt(n))) {
            System.out.println("Yes, it is a perfect Square");
        }else{
            System.out.println("No,it is not a Perfect Square");
        }
    }

    static boolean isPerfectSquare(int n){
        int root=(int)Math.sqrt(n);

        return (root*root)==n;
    }
}
