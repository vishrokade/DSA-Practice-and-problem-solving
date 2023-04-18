import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SumofDistances {
    public static void main(String[] args) {
        int[] nums = {1,3,1,1,2};
        System.out.println(Arrays.toString(distance(nums)));
    }
    static long[] distance(int[] nums) {
        long[] arr = new long[nums.length];
        int ans=0;

        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[i] == nums[j] && i != j){
                    ans = ans+Math.abs(i-j);
                }
            }
            arr[i] = ans;
            ans=0;
        }

        return arr;
    }
}
