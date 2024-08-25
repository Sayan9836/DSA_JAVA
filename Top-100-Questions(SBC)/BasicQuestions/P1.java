public class P1 {
    public static void main(String[] args) {
        int n=10;
        if (n>0) {
            System.out.println("positive"); 
        }else{
        System.out.println("negative");
        } 
    }
}



import java.io.*;
 
public class Sayan{

static void findTotalDistance(String S, int N)
{

    int []prefixDistance = new int[N];
    int []suffixDistance = new int[N];
 
    int cnt = 0;
 
    boolean haveOne = false;
    for (int i = 0; i < N; ++i) {
 
        if (S.charAt(i) == '1') {
 
            haveOne = true;
 
            cnt = 0;
 
            prefixDistance[i] = 0;
        }
 
        else if (haveOne) {
 
            cnt++;
            prefixDistance[i] = cnt;
        }

        else
            prefixDistance[i] = Integer.MAX_VALUE;
    }
 
    haveOne = false;
    for (int i = N - 1; i >= 0; --i) {
 
        if (S.charAt(i) == '1') {
 
            haveOne = true;
 
            cnt = 0;
 
            suffixDistance[i] = 0;
        }
 
        else if (haveOne) {
 
            cnt++;
 
            suffixDistance[i] = cnt;
        }
        else

            suffixDistance[i] = Integer.MAX_VALUE;
    }
 
    int sum = 0;
 
    for (int i = 0; i < N; ++i) {
 
        if (S.charAt(i) == '0') {
 
            sum += Math.min(prefixDistance[i],
                       suffixDistance[i]);
        }
    }
 
    System.out.print(sum);
}
 
public static void main(String []args)
{
    String S = "100100";
    int N = S.length();
 
    findTotalDistance(S, N);
}
}