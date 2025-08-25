// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class FactorSort {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {8, 2, 3, 12, 16};
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],FactorCount(arr[i]));
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b) -> b.getValue().compareTo(a.getKey()));
    }
    
    public static int FactorCount(int num){
        int count =0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        return count;
    }
}