import java.util.HashMap;
import java.util.Map;

public class OperationsEmptyArray {
    public static void main(String[] args) {
        int[] nums ={2,3,3,2,2,4,2,3};

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }

        int ans = 0;
        for (Map.Entry<Integer,Integer> set : map.entrySet()) {
            int count = set.getValue();
            if (count == 1){
                System.out.println(-1);
            }else {
                ans += count/3 + (count % 3 > 0 ? 1 : 0);
            }
        }
        System.out.println(ans);

        System.out.println(map);
    }
}
