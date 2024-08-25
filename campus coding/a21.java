import java.util.Scanner;

public class a21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr1=new char[26];
        char[] arr2 = new char[26];
        boolean flag = true;
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length() != str2.length()){
            System.out.println("NO");
        }else{ 
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            arr1[ch - 'a']++;
        }

        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            arr2[ch - 'a']++;
        }

        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
           if(arr1[ch - 'a'] != arr2[ch - 'a']){
             System.out.println("No");
             flag = false;
             break;
           }
        }
    }
     if(flag){
        System.out.println("Yes");
    }
    }
}
