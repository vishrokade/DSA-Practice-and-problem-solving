package College;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
public class LongestArithSubSequence {
    public static void main(String[] args) {
        int[] arr = {1,5,7,8,5,3,4,2,1};
        int diff = -2;

        Map<Integer, Integer> dp = new HashMap<>();
        int mx = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i] - diff;
            int tempAns = 0;

            if (dp.containsKey(temp)){
                tempAns = dp.get(temp);
            }

            dp.put(arr[i],tempAns+1);

            mx = Math.max(mx,dp.get(arr[i]));
        }
        System.out.println(mx);
    }
}
