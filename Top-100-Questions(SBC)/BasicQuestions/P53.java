import java.util.HashMap;

public class P53 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,5,4,3,2,6,7,2,1,1,2,1};
        int[] freqArr=new int[arr.length+1];
        for(int a:arr){
            freqArr[a]++;
        }
        for (int ele : arr) {
            System.out.println( "freq of "+ele+"->"+freqArr[ele]+" ");     
        }          

        // HashMap<Integer,Integer>map=new HashMap<>();

        // for(int a:arr){
        //     map.put(a,map.getOrDefault(a,0)+1);
        // }

        // for(int a:arr){
        //     System.out.println(map.get(a));
        // }

    } 
}
