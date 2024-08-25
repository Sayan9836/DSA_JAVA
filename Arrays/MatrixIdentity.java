public class MatrixIdentity {
    public static void main(String[] args) {
        int[][] arr = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<3;j++){
                if(i==j&& arr[i][j]!=1){
                 flag=false;
                 break;
                }
                if (i!=j&&arr[i][j]!=0){
                    flag=false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.print("Identity Matrix");
        } else {
            System.out.println("Not Identity Matrix");
        }
    }
}
