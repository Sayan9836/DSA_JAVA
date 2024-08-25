
public class M1 {

    public static void main(String[] args) {
        // System.out.println(count(3, 3));
        paths(3, 3, "");
        //  pathsDia(3, 3, "");
    }

    // no of ways to go from 0,0 to n,n (right and down are allowed)
    static int count(int row, int col) {

        if (row == 1 || col == 1) {
            return 1;
        }

        int right = count(row, col - 1);
        int down = count(row - 1, col);
        return right + down;
    }

    // print all the paths from 0,0 to n,n (right and down are allowed)
    static void paths(int row, int col, String str) {

        if (row == 1 && col == 1) {
            System.out.println(str);
            return;
        }
        if (col > 1) {
            paths(row, col - 1, str + "R");
        }
        if (row > 1) {
            paths(row - 1, col, str + "D");
        }
    }

   // print all the paths from 0,0 to n,n (right and down and diagonal are allowed)
    static void pathsDia(int row, int col, String str) {

        if (row == 1 && col == 1) {
            System.out.println(str);
            return;
        }
        if (col > 1) {
            pathsDia(row, col - 1, str + "H");
        }
        if (row > 1) {
            pathsDia(row - 1, col, str + "V");
        }
        if (row > 1 && col > 1) {
            pathsDia(row - 1, col - 1, str + "D");
        }

    }

}