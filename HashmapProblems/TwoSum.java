package HashmapProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,5,11,4,15};

        int tar = 9;

        int[] ans = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(tar - nums[i])){
                ans[0] = i;
                ans[1] = map.get(tar-nums[i]);
            }else {
                map.put(nums[i] , i);
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
