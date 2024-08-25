import java.util.Arrays;

public class M2 {
    // maze with Obstacles
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        // pathRestrictions("", maze, 0, 0);

        // allPaths("", maze, 0, 0);
        int[][] arr = new int[3][3];
        PrintallPaths("", maze, 0, 0, 1, arr);
    }

    // print all the paths from 0,0 to n,n (obstacles are present)
    static void pathRestrictions(String str, boolean[][] maze, int row, int col) {

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(str);
            return;
        }

        if (!maze[row][col]) {
            return;
        }
        if (row < maze.length - 1) {
            pathRestrictions(str + 'D', maze, row + 1, col);

        }

        if (col < maze[0].length - 1) {
            pathRestrictions(str + 'R', maze, row, col + 1);
        }
    }

    // print all the paths from 0,0 to n,n (you can move in any direction)
    // Backtracking
    static void allPaths(String str, boolean[][] maze, int row, int col) {

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(str);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;

        if (row < maze.length - 1) {
            allPaths(str + 'D', maze, row + 1, col);

        }

        if (col < maze[0].length - 1) {
            allPaths(str + 'R', maze, row, col + 1);
        }

        if (row > 0) {
            allPaths(str + 'U', maze, row - 1, col);

        }

        if (col > 0) {
            allPaths(str + 'L', maze, row, col - 1);
        }

        maze[row][col] = true;
    }

    static void PrintallPaths(String str, boolean[][] maze, int row, int col, int step, int[][] arr) {

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            arr[row][col] = step;
            for (int element[] : arr) {
                System.out.println(Arrays.toString(element));
            }
            System.out.println(str);
            System.out.println();
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        arr[row][col] = step;
        if (row < maze.length - 1) {
            PrintallPaths(str + 'D', maze, row + 1, col, step + 1, arr);

        }

        if (col < maze[0].length - 1) {
            PrintallPaths(str + 'R', maze, row, col + 1, step + 1, arr);
        }

        if (row > 0) {
            PrintallPaths(str + 'U', maze, row - 1, col, step + 1, arr);

        }

        if (col > 0) {
            PrintallPaths(str + 'L', maze, row, col - 1, step + 1, arr);
        }

        arr[row][col] = 0;
        maze[row][col] = true;
    }

}
