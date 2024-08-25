public class P36 {
    public static void main(String[] args) {
        int x=1,y=-5;

        if (x>0&&y>0) {
            System.out.println("Ist Quadrant");
        }else if(x>0&&y<0){
            System.out.println("2nd Quadrant");
        }else if(x<0&&y<0){
            System.out.println("3red Quadrant");
        }else if(x<0&&y>0){
            System.out.println("4th Quadrant");
        }else if(x==0&&y==0){
            System.out.println("Origin");
        }else if(x==0&&y!=0){
            System.out.println("Y-axis");
        }else{
            System.out.println("X-axis");
        }   
    }  
}
