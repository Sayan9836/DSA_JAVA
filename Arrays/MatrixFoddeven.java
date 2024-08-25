public class MatrixFoddeven{
    public static void main(String[] args) {

        int[][] a={{1,0,1},{2,3,5},{4,2,6}};
        int i,j;
        int even=0;
        int odd=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(a[i][j]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        System.out.println("Frequency of even no is: "+even);
        System.out.print("Frequency of odd no is: "+odd);
    }
}