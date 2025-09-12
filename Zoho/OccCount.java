import java.util.HashMap;
import java.util.Map;

public class OccCount {
    public static void main(String[] args) {
        int[] arr = {1,5,2,0,4,8,5,1,1,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> res : map.entrySet()){
            System.out.println(res.getKey()+" - "+res.getValue());
        }
    }
}
